package e.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Scenario:
//Given a sentence, find the most frequently occurring word using Java Streams.

//input:
//	String sentence = "apple banana apple orange apple banana orange apple";

//output:
//	Most Frequent Word: apple (4 times)

public class MostFrequentWord {

	public static void main(String[] args) {
		String sentence = "apple banana apple orange apple banana orange apple";
		getMostFrequentWord(sentence);

	}

	private static void getMostFrequentWord(String sentence) {
		List<String> lst = List.of(sentence.split(" "));
		Map<Object, Long> grouped = lst.stream().collect(Collectors.groupingBy(n->n , Collectors.counting()));
		System.out.println(grouped);

		//advanced 
		String mostOccName = 
		lst.stream().collect(Collectors.groupingBy(n->n , Collectors.counting()))
		.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null);
		System.out.println(mostOccName);
	}





}
