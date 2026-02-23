package FunctionalInterface;

import java.util.Arrays;
import java.util.List;

class MethodInterface {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Charlies", "Bob");
		// 1. For loop
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i));
		}
		
		names.forEach(System.out::println);
	}
}