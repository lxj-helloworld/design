package decorator;

/**
 * 具体的装饰物2
 */
public class CheapCloth extends PersonCloth{
    public CheapCloth(Person person) {
        super(person);
    }

    /**
     * 穿短裤
     */
    private void dressShorts(){
        System.out.println("穿短袖");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
