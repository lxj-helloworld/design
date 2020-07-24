package abstractFactory1;

/**
 * 普通制动
 */
public class NormalBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
