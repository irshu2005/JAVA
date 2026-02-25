package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FirstStreamDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//1. for-each loop
		List<Integer> result = new ArrayList<>();
		for(int num : numbers) {
			if(num % 2 == 0) {
				result.add(num);
			}
		}
		System.out.println("Even numbers without streams: " +result);
		
		//2. Streams
		List<Integer> str = numbers.stream().filter((integer) -> integer%2 == 0).toList();
		System.out.println("Even numbers with streams: " + str);
		
	}
}