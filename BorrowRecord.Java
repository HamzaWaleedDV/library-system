public class BorrowRecord {
    private  User user;
    private  Book book ;
    private String borrowDate;
    
    public BorrowRecord(User user, Book book, String borrowDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
    }

    public User getUser() {
        return user;
    }
    public Book getBook() {
        return book;
    }
    public String getBorrowDate() {
        return borrowDate;
    }
}
