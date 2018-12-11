import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {

    private Book wuthering;
    private Book scanner;
    private Book catcher;
    private Book forever;
    private Library partick;
    private Borrower robbie;

    @Before
    public void before() {
        wuthering = new Book("Wuthering Heights", "Emily Bronte", "Tragedy");
        scanner = new Book("A Scanner, Darkly", "Philip K Dick", "Sci-Fi");
        catcher = new Book("Catcher in the Rye", "JD Salinger", "Coming of Age");
        forever = new Book("The Forever War", "Joe Haldeman", "Sci-Fi");
        partick = new Library(3);
        robbie = new Borrower();
        partick.addBook(wuthering);
        partick.addBook(scanner);
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, robbie.countBooks());
    }

    @Test
    public void canBorrowBook() {
        robbie.borrowBook(partick, wuthering);
        assertEquals(1, partick.countBooks());
        assertEquals(1, robbie.countBooks());
    }

    @Test
    public void cannotBorrowBookIfBookNotPresent() {
        robbie.borrowBook(partick, forever);
        assertEquals(2, partick.countBooks());
        assertEquals(0, robbie.countBooks());
    }
}
