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

    public boolean checkStock() {
        if (this.collection.size()<= capacity){
            return true;
        }else{
            return false;
        }
    }
}
