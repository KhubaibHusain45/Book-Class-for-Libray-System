package Practice_Folder;

import static Practice_Folder.Book.getTotalBooks;

public class BorrowedBook2 {
    public static boolean Book2() {
        Book newBook = new Book("Think and Grow Rich", "Napolean Hill", "09128302173234");
        newBook.borrowBook();
        System.out.println("ISBN: " + newBook.ISBN);
        System.out.println("Title: " + newBook.title);
        System.out.println("Author: " + newBook.author);
        System.out.println("No. of total borrowed books are now: " + getTotalBooks());
        myBook.returnBook();

        return true;
    }
}
