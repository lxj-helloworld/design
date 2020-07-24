package stragety;

/**
 * 策略，用来约束一系列具体的策略算法
 */
public interface CalculateStrategy {
    /**
     * 按照距离计算公里数
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
