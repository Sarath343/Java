package e.exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Scenario:
//A bank needs to group transactions by type (e.g., "Credit", "Debit").

//Input:
//List<Transaction> transactions = List.of(
//	    new Transaction("Credit", 1000),
//	    new Transaction("Debit", 500),
//	    new Transaction("Credit", 1500),
//	    new Transaction("Debit", 700),
//	    new Transaction("Credit", 1200)
//	);

//output:
//	Credit Transactions: [1000, 1500, 1200]
//			Debit Transactions: [500, 700]

public class GroupTransaction {

	public static void main(String[] args) {

		List<Transaction> transactions = List.of(
				new Transaction("Credit", 1000), 
				new Transaction("Debit", 500),
				new Transaction("Credit", 1500), 
				new Transaction("Debit", 700), 
				new Transaction("Credit", 1200));

		groupTransactionByType(transactions);
	}

	private static void groupTransactionByType(List<Transaction> transactions) {
		
	Map<String, List<Integer>>	 map = transactions.stream().collect(Collectors.groupingBy(
			Transaction::getTransactionType,
			Collectors.mapping(Transaction::getAmount, Collectors.toList())
			));
	
	System.out.println(map);
	}

}
