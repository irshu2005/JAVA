package optionals;

import java.util.Optional;

class Optionals {
	public static void main(String[] args) {
		String name = "JAVA";
		if(name != null) {
			System.out.println(name.length());
		}else {
			System.out.println("No name value");
		}
		
		//Creating Optionals - To avoid NullPointerException
		
		Optional<String> optionalString = Optional.of("Java");
		System.out.println(optionalString);
		
		// Optional.of(null); // ❌ NPE
		Optional.ofNullable(null); // ✅ Allowed
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> mayBe = Optional.ofNullable(null);
		System.out.println(mayBe);
		
		// get()
		System.out.println(optionalString.get());
		//System.out.println(mayBe.get());
		
		// orElse("default value print hogi agr Null hoga to")
		
		System.out.println(optionalString.orElse("default"));
		System.out.println(mayBe.orElse("Ye wali value print hogi!!"));
		System.out.println(mayBe.orElse(null));
		String temp = mayBe.orElse("default");  //temp ko assign krke use kr skte h
		
	}
}