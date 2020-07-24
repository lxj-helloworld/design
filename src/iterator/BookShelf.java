package iterator;

/**
 * 具体的集合
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last;

    BookShelf(int size){
        books = new Book[size];
        last = 0;
    }

    public void addBook(Book book){
        books[last] = book;
        last++;
    }

    public int getLenth(){
        return last;
    }

    public Book getBook(int index){
        return books[index];
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
