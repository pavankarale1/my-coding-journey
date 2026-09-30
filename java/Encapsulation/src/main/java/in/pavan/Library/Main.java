package in.pavan.Library;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(101, "Java Programming", "James Gosling", true);

        // Display book details
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Available: " + book.getIsAvailable());



        // Issue book
        book.issueBook();

        // Check availability
        System.out.println("Available: " + book.getIsAvailable());



        // Try to issue the book again
        book.issueBook();



        // Return book
        book.returnBook();

        // Check availability
        System.out.println("Available: " + book.getIsAvailable());



        // Try to return the book again
        book.returnBook();
    }


}
