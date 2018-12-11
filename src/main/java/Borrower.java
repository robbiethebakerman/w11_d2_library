import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower() {
        this.bookCollection = new ArrayList<>();
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void borrowBook(Library library, Book book) {
        if (library.containsBook(book)) {
            library.removeBook(book);
            bookCollection.add(book);
        }
    }
}
