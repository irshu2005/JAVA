package FunctionalInterface;

@FunctionalInterface
interface BookAction {
	void perform();
}

@FunctionalInterface
interface Operation {
	int add(int a, int b);
}

class Lambda {
	public static void main(String[] args) {
		BookAction action = () -> System.out.println("Action Performed");
		Operation o = (int a, int b) -> {
			return a+b;
		};
		System.out.println(o.add(10, 20));
		
		//THREAD INTERFACE
		new Thread(() -> System.out.print("Thread Created")).start();
	}
}