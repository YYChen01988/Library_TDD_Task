import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1, book2;
    Borrower borrower;
    
    @Before
    public void before(){
        borrower = new Borrower();

        book1 = new Book("Harry Potter", "JK Rowling", "Fiction");
        book2 = new Book("Prince Fisher", "Andy McLaugin", "Children Book");
        library = new Library(5);
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
    }
    
    @Test
    public void libraryStartBookNumber(){
        assertEquals(2, library.getNumberOfBook());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBookToCollection(book1);
        assertEquals(3, library.getNumberOfBook());
    }

    @Test
    public void canCountNumberOfBooks(){
        assertEquals(2, library.getNumberOfBook());
    }

    @Test
    public void checkStockIsNotFull() {
        assertEquals(true, library.checkStock());
    }

    @Test
    public void checkStockIsFull() {
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        assertEquals(false, library.checkStock());

    }


    @Test
    public void canLendABookToBorrower() {
        library.lendBookToBorrower(borrower, book1);
        assertEquals(1,library.getNumberOfBook());
        assertEquals(1,borrower.numberOfBorrowedBook());

    }
}
