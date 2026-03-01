class Library {
   // int availableBooks = 3;

    public void borrowbooks(int bookRequested) {
        int[] books = {100, 102, 103};

        if (bookRequested < 0 || bookRequested >= books.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid book index!");
        }

        System.out.println("Book Requested: " + books[bookRequested]);
    }
}

class Practice {
    public static void main(String[] args) {
        Library o = new Library();

        try {
            o.borrowbooks(5);   // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}