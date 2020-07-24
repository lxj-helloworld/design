package adapter1;

/**
 * 适配器角色，适配旧方法的具体实现方式
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String message) {
        super(message);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
