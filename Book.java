package Practice_Folder;

public class Book {
    String title;
    String author;
    String ISBN;

    static int totalBooks;


    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void borrowBook() {
        System.out.println("Book Borrowed");
        totalBooks++;
    }

     public void returnBook() {
        System.out.println("Book named " + this.title + " is returned.");
        totalBooks--;
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        boolean infoOne = BorrowedBook1.Book1();
        System.out.println(infoOne);

        System.out.println("---------------------------------------");

        boolean infoTwo = BorrowedBook2.Book2();
        System.out.println(infoTwo);

        System.out.println("---------------------------------------");

    }
}
