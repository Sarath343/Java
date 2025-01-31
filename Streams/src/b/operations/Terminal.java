package b.operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Terminal {
	// collect()
	// count()
	// findFirst()
	// findAny()
	// anyMatch(condition)
	// allMatch(condition)
	// noneMatch(condition)

	public static void main(String[] args) {
		List<Integer> lst = List.of(1, 2, 3, 4, 4, 5, 6, 7, 8, 7, 8, 9, 2);

		 collectAndCount(lst);
		// doFind(lst);
		//findingMatches(lst);

	}

	private static void findingMatches(List<Integer> lst) {
		System.out.println(lst.stream().anyMatch(x -> x > 8));
		System.out.println(lst.stream().allMatch(x->x%2==0));
		System.out.println(lst.stream().noneMatch(x->x>20));

	}

	private static void doFind(List<Integer> lst) {
		System.out.println(lst.stream().filter(x -> x > 4).findFirst().get());

		System.out.println(lst.stream().filter(x -> x < 4).findAny().get());

	}

	private static void collectAndCount(List<Integer> lst) {
		System.out.println(lst.stream().count());
		List<Integer> collected = lst.stream().distinct().collect(Collectors.toList());
		// collected.forEach(System.out::println);
		Set<Integer> sortedCollected = lst.stream().sorted().collect(Collectors.toSet());
		sortedCollected.forEach(System.out::println);
		
		long count = lst.stream().count();
		System.out.println("count "+count);
	}

}
