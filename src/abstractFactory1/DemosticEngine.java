package abstractFactory1;

/**
 * 国产发动机
 */
public class DemosticEngine implements IEngine{
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
