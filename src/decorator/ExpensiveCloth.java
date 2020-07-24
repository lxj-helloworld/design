package decorator;

/**
 * 具体的装饰物对象1
 */
public class ExpensiveCloth extends PersonCloth{

    public ExpensiveCloth(Person person) {
        super(person);
    }

    /**
     * 穿短袖
     */
    private void dressShirt(){
        System.out.println("穿短袖");
    }
    /**
     * 穿皮衣
     */
    private void dressLeather(){
        System.out.println("穿皮衣");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
    }
}
