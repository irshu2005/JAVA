package ExceptionHandling;

// Step 1: Create Custom Exception
class NotEnoughBooksException extends Exception {

    public NotEnoughBooksException(String message) {
        super(message);
    }
}

// Step 2: Business Logic Class
class Lib {

    int availableBooks = 3;

    public void borrowBooks(int bookRequestedCount) throws NotEnoughBooksException {

        if (bookRequestedCount > availableBooks) {
            throw new NotEnoughBooksException("Requested books exceed available books");
        }

        System.out.println("Books borrowed successfully");
    }
}

// Step 3: Main Class (Caller)
public class CustomExceptionExample {

    public static void main(String[] args) {

        Lib library = new Lib();

        try {
            library.borrowBooks(5);
        } catch (NotEnoughBooksException e) {
            System.out.println("Custom Exception Handled");
            System.out.println(e.getMessage());
        }
    }
}