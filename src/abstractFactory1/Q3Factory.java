package abstractFactory1;

/**
 * 创建Q3的工厂
 */
public class Q3Factory extends CarFactory{
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DemosticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
