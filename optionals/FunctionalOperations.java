package optionals;

import java.util.Optional;

public class FunctionalOperations {
	public static void main(String[] args) {
		
		// ifPresent()
		// map()
		// filter()
		
		Optional<String> name = Optional.of("JAVA");
		Optional<String> nullOptional = Optional.ofNullable(null);
		
		//ifPresent()
		nullOptional.ifPresent(value -> {
			System.out.println(value);
			System.out.println("Hello!!");
		});
		
		  // map()
        Optional<String> upperCase = name.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));
        
        //filter()
        name.filter(n -> n.startsWith("J"))
        .ifPresent(System.out::println);
        
        // Combined Operation
        name.filter(n -> n.startsWith("F"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
	}
	

}
