package a.create;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Create {

	public static void main(String[] args) {
		//createStreamForCollections();
		//createStreamFromArray();
		//createByStreamBuilder();
		infiniteStreams();
		
	}

	private static void infiniteStreams() {
		Stream.iterate(1, n -> n + 1).limit(6).forEach(System.out::println);
		
		Random random = new Random();
		Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
	}

	private static void createByStreamBuilder() {
		Stream<String> streamBuilder = Stream.<String>builder().add("A").add("B").build();
		streamBuilder.forEach(System.out::println);
	}

	private static void createStreamFromArray() {
		Stream.of(1,2,3,4).forEach(System.out::println);
		
		//the below doesnt work as expected, it prints an object
		int [] arr =  new int[] {11,12,13,14};
		Stream.of(arr).forEach(System.out::println);
		
	}

	private static void createStreamForCollections() {
		List<String> lst = List.of("first","second");
		lst.stream().forEach(System.out::println);
		
		Set<String> set = Set.of("a","b","c");
		set.stream().forEach(System.out::println);
		
		
	}

}
