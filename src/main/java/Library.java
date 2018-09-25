import java.util.ArrayList;

public class Library {
    private int capacity;
    ArrayList<Book> collection;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getNumberOfBook() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }

    public void removeBookFromCollection(int bookIndex) {
        this.collection.remove(bookIndex);
    }

    public boolean checkStock() {
        if (this.collection.size()<= capacity){
            return true;
        }else{
            return false;
        }
    }


    public void lendBookToBorrower(Borrower borrower, Book book) {
        int bookIndex = this.collection.indexOf(book);
        if (bookIndex >= 0){
            removeBookFromCollection(bookIndex);
            borrower.addBorrowBook(book);
        }
    }
}
