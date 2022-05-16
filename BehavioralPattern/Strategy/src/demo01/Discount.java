package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:48 2021/5/27
 * @description 策略模式 - 抽象策略接口 -  优惠算法接口
 */
public interface Discount {

    /**
     * 优惠算法
     * @param price
     * @return
     */
    double calculate(double price);
}
