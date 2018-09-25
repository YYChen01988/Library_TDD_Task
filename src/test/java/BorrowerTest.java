import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Harry Potter", "JK Rowling", "Fiction");
    }

    @Test
    public void borrowerStartsEmptyBook(){
        assertEquals(0, borrower.numberOfBorrowedBook());
    }

    @Test
    public void borrowMoreBook() {
        borrower.addBorrowBook(book);
        assertEquals(1, borrower.numberOfBorrowedBook());
    }

    @Test
    public void canReturnBorrowedBook() {
        borrower.addBorrowBook(book);
        borrower.addBorrowBook(book);
        borrower.returnABorrowedBook();
        assertEquals(1,borrower.numberOfBorrowedBook());

    }
}
