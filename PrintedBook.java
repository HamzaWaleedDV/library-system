public class PrintedBook extends Book {

    public int pages;

    public PrintedBook(int id, String title, String author, boolean available, int pages) {
        super(id, title, author, available);
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }
}