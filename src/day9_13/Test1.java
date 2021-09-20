package day9_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		Stream s1 = Stream.of(5, 2, 1, 3, 4);

		s1 = s1.sorted((a, b) -> {

			return (Integer) b - (Integer) a;

		});

		s1.forEach(System.out::print);

		System.out.println("==================");

		Stream s5 = Stream.iterate(1, (n) -> {

			return n + 1;

		});

		s5 = s5.limit(99999);

		long start = System.currentTimeMillis();

		// s5.forEach(System.out::println);

		long end = System.currentTimeMillis();

		System.out.println(end - start);

		System.out.println("==========aaa==========");
		Stream s6 = Stream.of("a", "b", "c", "d", "e");

		s6 = s6.map((n) -> {

			n = ((String) n).toUpperCase();

			return n;

		});
		
	/*	List list = new ArrayList();
		s6.forEach((n) -> {

			
			list.add(n);

			
		});

		System.out.println(list);*/
	

		s6.collect(Collectors.toList());
		
	}

}
