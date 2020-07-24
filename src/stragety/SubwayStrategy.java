package stragety;

/**
 * 地铁价格计算策略
 */
public class SubwayStrategy implements CalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        /**
         * 这里是地铁价格计算策略
         */
        return km * 2;
    }
}
