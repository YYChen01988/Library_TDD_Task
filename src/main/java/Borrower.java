import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> borrowedbooks;

    public Borrower(){
        this.borrowedbooks = new ArrayList<>();
    }

    public int numberOfBorrowedBook() {
        return this.borrowedbooks.size();
    }

    public void addBorrowBook(Book book) {
        this.borrowedbooks.add(book);
    }

    public Book returnABorrowedBook() {
        return this.borrowedbooks.remove(0);
    }
}
