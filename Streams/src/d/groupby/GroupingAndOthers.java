package d.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndOthers {

	public static void main(String[] args) {
		List<String> lst = List.of("Arun", "Abi", "Kiran", "Kumar", "Tej");
		 getGrouped(lst);
		getJoinedString(lst);
	}

	private static void getJoinedString(List<String> lst) {
		String joined = lst.stream().collect(Collectors.joining(","));
		System.out.println(joined);
	}

	private static void getGrouped(List<String> lst) {
		Map<Character, List<String>> grouped = lst.stream().collect(Collectors.groupingBy(name -> name.charAt(1)));
		System.out.println(grouped);
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9, 2);
		Map<String, List<Integer>> groupedNum = list.stream()
				.collect(Collectors.groupingBy(num -> num % 2 == 0 ? "even" : "odd"));
		System.out.println(groupedNum);
	}

}
