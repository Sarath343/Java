package b.operations;

import java.util.List;

public class Intermediate {
	// filter
	// map
	// distinct
	// sorted
	// limit(n) :	Will return first n elements only in the Stream
	// skip(n)	:	Will discard the first n elements of the Stream

	public static void main(String[] args) {
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6,7,8, 7, 8,9,2);
		//doFilter(lst);
		//doMap(lst);
		doDistinctMapFilterSort(lst);

	}

	private static void doDistinctMapFilterSort(List<Integer> lst) {
		lst.stream().distinct().filter(x->x<5).map(x->x*x).sorted().skip(1).limit(2).forEach(System.out::println);
	}

	private static void doMap(List<Integer> lst) {
		lst.stream().map(x -> 2 * x).forEach(System.out::println);
	}

	private static void doFilter(List<Integer> lst) {
		lst.stream().filter(x -> x < 6).forEach(System.out::println);
	}

}
