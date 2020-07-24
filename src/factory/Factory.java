package factory;

/**
 * 生成产品的抽象类，定义了生成产品的步骤
 */
public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        resisterProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void resisterProduct(Product product);
}
