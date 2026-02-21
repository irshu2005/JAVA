abstract class Animal{
	abstract void makeSound();
	
	 void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class AbstractClass{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		d.sleep();
	}
}