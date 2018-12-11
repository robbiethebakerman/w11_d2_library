import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<>();
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void addBook(Book book) {
        if (!checkStockFull()) {
            this.bookCollection.add(book);
        }
    }

    public boolean checkStockFull() {
        return countBooks() >= capacity;
    }

    public void removeBook(Book book) {
        bookCollection.remove(book);
    }

    public boolean containsBook(Book book) {
        return bookCollection.contains(book);
    }
}
