import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    
    @Before
    public void before(){
        library = new Library(5);
        book = new Book();
    }
    
    @Test
    public void libraryStartEmpty(){
        assertEquals(0, library.getNumberOfBook());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBookToCollection(book);
        assertEquals(1, library.getNumberOfBook());
    }

    @Test
    public void canCountNumberOfBooks(){
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        assertEquals(2, library.getNumberOfBook());
    }

    @Test
    public void checkStockIsNotFull() {
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        assertEquals(true, library.checkStock());
    }

    @Test
    public void checkStockIsFull() {
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        assertEquals(false, library.checkStock());

    }
}
