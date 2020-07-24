package responsibility;

/**
 * 处理者
 */
public class GroupLeader extends Leader{
    @Override
    public int limit() {
        return 1000;
    }
    @Override
    public void handler(int money) {
        System.out.println("组长批复报销" + money + "元");
    }
}
