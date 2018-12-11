import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Book wuthering;
    private Book scanner;
    private Book catcher;
    private Book forever;
    private Library partick;

    @Before
    public void before() {
        wuthering = new Book("Wuthering Heights", "Emily Bronte", "Tragedy");
        scanner = new Book("A Scanner, Darkly", "Philip K Dick", "Sci-Fi");
        catcher = new Book("Catcher in the Rye", "JD Salinger", "Coming of Age");
        forever = new Book("The Forever War", "Joe Haldeman", "Sci-Fi");
        partick = new Library(3);
        partick.addBook(wuthering);
        partick.addBook(scanner);
    }

    @Test
    public void canCountBooks() {
        assertEquals(2, partick.countBooks());
    }

    @Test
    public void canAddBook() {
        partick.addBook(catcher);
        assertEquals(3, partick.countBooks());
    }

    @Test
    public void canCheckStockFullTrue() {
        partick.addBook(forever);
        assertTrue(partick.checkStockFull());
    }

    @Test
    public void canCheckStockFullFalse() {
        assertFalse(partick.checkStockFull());
    }

    @Test
    public void cannotAddBookIfStockIsFull() {
        partick.addBook(forever);
        partick.addBook(catcher);
        assertEquals(3, partick.countBooks());
    }

    @Test
    public void canRemoveBook() {
        partick.removeBook(wuthering);
        assertEquals(1, partick.countBooks());
    }

    @Test
    public void canFindIfLibraryContainsBookTrue() {
        assertTrue(partick.containsBook(wuthering));
    }

    @Test
    public void canFindIfLibraryContainsBookFalse() {
        assertFalse(partick.containsBook(forever));
    }
}
