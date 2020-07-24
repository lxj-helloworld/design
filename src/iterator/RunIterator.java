package iterator;

/**
 * 测试
 */
public class RunIterator {
    public static void main(String[] args){
        //初始化集合并添加元素
        BookShelf bookShelf = new BookShelf(10);
        for(int i=0;i<10;i++){
            bookShelf.addBook(new Book("张三"+i,"张三"+i+"的周末"));
        }
        //使用迭代器访问集合中的元素
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
