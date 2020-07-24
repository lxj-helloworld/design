package responsibility;

/**
 *
 */
public class Director extends Leader{
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handler(int money) {
        System.out.println("主管批复报销" + money + "元");
    }
}
