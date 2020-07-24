package decorator;

/**
 * 需要被装饰的原始对象
 */
public class Boy extends Person{
    @Override
    public void dressed() {
        System.out.print("穿了衬衫");
    }
}
