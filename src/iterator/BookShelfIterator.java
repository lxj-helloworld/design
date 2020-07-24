package iterator;

/**
 * 具体的迭代器，实现顺序访问集合中元素的方法
 */
public class BookShelfIterator implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;

    BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLenth()){
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBook(index++);
    }
}
