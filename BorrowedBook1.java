package Practice_Folder;

import static Practice_Folder.Book.getTotalBooks;

public class BorrowedBook1 {
    public static boolean Book1() {
        Book myBook = new Book("In The Line of Fire", "Musharraf", "12345678987654321");
        myBook.borrowBook();
        System.out.println("ISBN: " + myBook.ISBN);
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("No. of total borrowed books are now: " + getTotalBooks());
        myBook.returnBook();

        return true;
    }
}
