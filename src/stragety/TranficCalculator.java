package stragety;

/**
 * 上下文，使用策略的角色
 */
public class TranficCalculator {
    CalculateStrategy mCalculateStrategy;
    public static void main(String[] args){
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setmCalculateStrategy(new BusStrategy());
        System.out.println("公交车价格计算");
        System.out.println(tranficCalculator.calculatePrice(3));

        tranficCalculator.setmCalculateStrategy(new SubwayStrategy());
        System.out.println("地铁价格计算");
        System.out.println(tranficCalculator.calculatePrice(3));
    }

    public void setmCalculateStrategy(CalculateStrategy mCalculateStrategy) {
        this.mCalculateStrategy = mCalculateStrategy;
    }

    public int calculatePrice(int km){
        return mCalculateStrategy.calculatePrice(km);
    }
}
