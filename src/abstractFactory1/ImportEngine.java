package abstractFactory1;

/**
 * 进口发动机
 */
public class ImportEngine implements IEngine{
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
