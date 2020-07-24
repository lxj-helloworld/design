package bridge1;

/**
 * 抽象部分的实现1
 */
public class LargeCoffee extends Coffee{
    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + coffeeAdditives + "咖啡");
    }
}
