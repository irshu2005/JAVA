package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * USE CASES:
 * 1. Filtering
 * 2. Mapping
 * 3. Aggregation
 * 4. Searching
 * 5. Iteration
 *
 *
 * */

class StreamsDemo {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
		
		Stream<String> stream = items.stream();
		stream.forEach(System.out::println);
		
		 System.out.println("== Filtered Fruits ==");
		 
		 items.stream().filter(name -> name.startsWith("B")).forEach(System.out::println);
	}
}