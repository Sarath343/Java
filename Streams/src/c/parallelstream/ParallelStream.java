package c.parallelstream;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> lst = List.of(1, 2, 3, 4, 4, 5, 6, 7, 8, 7, 8, 9, 2);
		//parallelStreamThreads(lst);
		parallelStreamDuration(lst);

	}

	private static void parallelStreamDuration(List<Integer> lst) {
		LocalDateTime time1 = LocalDateTime.now();
		lst.parallelStream().forEach(System.out::println);
		System.out.println(time1.until(LocalDateTime.now(),ChronoUnit.MILLIS ) );
		LocalDateTime time2 = LocalDateTime.now();
		for(Integer i : lst) {
			System.out.println(i);
		}
		//Since it is a small collection the for loop performs quickly than stream
		System.out.println(time2.until(LocalDateTime.now(), ChronoUnit.MILLIS));
		
	}

	private static void parallelStreamThreads(List<Integer> lst) {
		lst.parallelStream().forEach(n->{
		System.out.println(Thread.currentThread().getName()+" : "+n);}
				);
		
	}

}
