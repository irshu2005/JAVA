package ExceptionHandling;

class ShardaLibrary {

    int availableBooks = 3; 

    // Method declares exception using throws
    public void borrowBooks(int bookRequestedCount) throws Exception {

        if (bookRequestedCount > availableBooks) {
            throw new Exception("Not enough books available");
        }

        System.out.println("Books borrowed successfully");
    }
}

public class Throws {

    public static void main(String[] args) {

        ShardaLibrary library = new ShardaLibrary();

        try {
            library.borrowBooks(5);
        } catch (Exception e) {
            System.out.println("Exception handled in main");
            System.out.println(e.getMessage());
        }
    }
}