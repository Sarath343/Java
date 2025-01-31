package e.exercises;

public class Transaction {
	private String transactionType;
	private int amount;

	

	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", amount=" + amount + "]";
	}

	public String getTransactionType() {
		return transactionType!=null ?transactionType:"Unknown";
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Transaction(String transactionType, int amount) {
		super();
		this.transactionType = transactionType;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
