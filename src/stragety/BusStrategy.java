package stragety;

/**
 * 公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        /*
        这里是公交车价格计算策略的具体计算过程
        这里简单计算
         */
        return km * 1;
    }
}
