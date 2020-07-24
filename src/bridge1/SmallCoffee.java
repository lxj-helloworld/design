package bridge1;

/**
 * 抽象部分的实现2
 */
public class SmallCoffee extends Coffee{
    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + coffeeAdditives + "咖啡");
    }
}
