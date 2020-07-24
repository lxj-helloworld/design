package proxy;

/**
 * 具体的主体
 */
public class XiaoMing implements ILawsuiit{
    @Override
    public void submit() {
        System.out.println("老板拖欠工资。");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的工资流水。");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿，不需要再说什么了。");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功。");
    }
}
