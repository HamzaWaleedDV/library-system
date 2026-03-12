import java.util.ArrayList;

public class BookManager {
    
    public void addBook(Library library, Book book){
        library.books.add(book);
    }

    public Book findBook(Library library, int id){
        for(int i = 0 ; i < library.books.size(); i++)
            if (library.books.get(i).id == id) 
                return library.books.get(i);
        return null;
    }

    public ArrayList<Book> getAllBooks(Library library){
        return library.books;
    }
}
