package FunctionalInterface;

import java.util.function.BiFunction;

class BiFunctional {
	public static BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a+b;
	
	  public static BiFunction<Integer, Integer, Integer> subtract
      = (a, b) -> a - b;
      
	public static void main(String[] args) {
		System.out.println(addFunction.apply(10, 20));
		
		   System.out.println(subtract.apply(10,20));
	}
}
