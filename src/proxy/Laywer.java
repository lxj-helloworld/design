package proxy;

/**
 * 代理人
 */
public class Laywer implements ILawsuiit{
    private ILawsuiit lawsuiit;

    public Laywer(ILawsuiit lawsuiit) {
        this.lawsuiit = lawsuiit;
    }

    @Override
    public void submit() {
        lawsuiit.submit();
    }

    @Override
    public void burden() {
        lawsuiit.burden();
    }

    @Override
    public void defend() {
        lawsuiit.defend();
    }

    @Override
    public void finish() {
        lawsuiit.finish();
    }
}
