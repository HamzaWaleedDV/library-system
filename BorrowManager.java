import java.time.LocalDate;

public class BorrowManager {
    public void borrowBook(Library library, int userId, int bookId) {
        UserManager userManager = new UserManager();
        BookManager bookManager = new BorrowManager();

        User user = userManager.findUserById(library, userId);
        Book book = bookManager.findBookById(library, bookId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.borrowBook();
        String today = LocalDate.now().toString();
        BorrowRecord newRecord = new BorrowRecord(user, book, today);
        library.getRecords().add(newRecord);
    }
}