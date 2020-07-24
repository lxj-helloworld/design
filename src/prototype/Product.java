package prototype;

/**
 * 定义复制功能的接口
 */
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
