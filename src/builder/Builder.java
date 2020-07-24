package builder;

/**
 * 建造者抽象类，用于定义生成对象所需要的所有的方法
 */
public abstract class Builder{
    public abstract void makeTitle(String title);
    public abstract void makeString(String string);
    public abstract void makeItems(String item);
    public abstract void close();
}
