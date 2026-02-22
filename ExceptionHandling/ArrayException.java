package ExceptionHandling;

class Library {
	int availableBooks = 3;
	
	public void borrowbooks(int bookRequested) {
		try {
			int[] books = {101, 102, 103};
			System.out.print("Book Requested :"+ books[bookRequested]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Occurred!!");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
class ArrayException {
	public static void main(String[] args) {
		Library ob = new Library();
		ob.borrowbooks(2);
	}
}