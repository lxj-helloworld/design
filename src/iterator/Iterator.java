package iterator;

/**
 * 定义迭代器需要实现的方法
 *
 */
public interface Iterator<T> {
    boolean hasNext(); //是否存在下一个元素
    T next(); //返回下一个元素
}
