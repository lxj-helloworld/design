package bridge1;

/**
 * 测试
 */
public class Main {
    public static void main(String[] args){
        //原汁原味
        OrdinaryCoffee ordinaryCoffee = new OrdinaryCoffee();
        //加糖
        SugerCoffee sugerCoffee = new SugerCoffee();
        //大杯咖啡 原味
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(ordinaryCoffee);
        largeCoffeeOrdinary.makeCoffee();
        ///小杯咖啡 原味
        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(ordinaryCoffee);
        smallCoffeeOrdinary.makeCoffee();

        //大杯咖啡 加糖
        LargeCoffee largeCoffeeSuger = new LargeCoffee(sugerCoffee);
        largeCoffeeSuger.makeCoffee();
        //小杯咖啡 加糖
        SmallCoffee smallCoffeeSuger = new SmallCoffee(sugerCoffee);
        smallCoffeeSuger.makeCoffee();
    }
}
