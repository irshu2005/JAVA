package ExceptionHandling;

class DGILibrary {
	int availableBooks = 3;
	
	public void borrowbooks(int bookRequestedCount) {
		try {
			if(bookRequestedCount > availableBooks) {
				throw new ArrayIndexOutOfBoundsException("Not enough books available");
			}
			System.out.println("Books borrowed successfully");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Occurred!!");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
class Throw {
	public static void main(String[] args) {
		DGILibrary ob = new DGILibrary();
		ob.borrowbooks(5);
	}
}