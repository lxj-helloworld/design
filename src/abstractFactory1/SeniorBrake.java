package abstractFactory1;

/**
 * 高级制动
 */
public class SeniorBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
