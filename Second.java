class Second{
	int id;
	int salary;
	String name;
	
	public void printDetails() {
		System.out.println("Id : "+ id);
		System.out.println("Name : "+ name);
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Second ob = new Second();
		ob.id = 10;
		ob.name = "Irshu";
		ob.printDetails();
		Second ob2 = new Second();
		ob2.salary = 1000000;
		System.out.print("Salary : "+ ob2.getSalary());
	}
}