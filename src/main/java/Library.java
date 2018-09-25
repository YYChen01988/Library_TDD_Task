import java.util.ArrayList;

public class Library {

    ArrayList<Book> collection;

    public Library(){
        this.collection = new ArrayList<>();
    }

    public int getNumberOfBook() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }
}
