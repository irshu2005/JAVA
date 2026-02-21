class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
class Student extends Person{
	int marks;
	public Student(String name, int age, int marks) {
		super(name, age);
		this.marks = marks;
	}
	public void displayStudent() {
		System.out.println("Marks : "+marks);
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Student c = new Student("Irshad", 22, 56);
		c.displayPerson();
		c.displayStudent();
		
	}
}