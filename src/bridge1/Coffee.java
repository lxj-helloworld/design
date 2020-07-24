package bridge1;

/**
 * 抽象部分
 * 需要保持一个对实现部分对象的引用，一边调用具体的实现
 */
public abstract class Coffee {
    protected CoffeeAdditives coffeeAdditives;
    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }
    /**
     * 由子类决定咖啡具体是什么样子
     */
    public abstract void makeCoffee();
}
