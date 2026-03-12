public class Book {
    public int id;
    public String title;
    public String author;
    public boolean availible;

    public Book(int id, String title, String author, boolean availible) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availible = availible;
    }

    public void borrowBook() {
        availible = false;
    }

    public void returnBook() {
        availible = true;
    }

    public boolean isAvailible() {
        return availible;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
