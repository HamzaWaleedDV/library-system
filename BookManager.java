import java.util.ArrayList;

public class BookManager {
    
    public void addBook(Library library, Book book){
        library.getBooks().add(book);
    }

    public Book findBook(Library library, int id){
        for(int i = 0 ; i < library.books.size(); i++)
            if (library.getBooks().get(i).getID() == id) 
                return library.getBooks().get(i);
        return null;
    }

    public ArrayList<Book> getAllBooks(Library library){
        return library.getBooks();
    }
}
