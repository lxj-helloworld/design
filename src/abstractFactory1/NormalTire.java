package abstractFactory1;

/**
 * 普通轮胎
 */
public class NormalTire implements ITire{
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
