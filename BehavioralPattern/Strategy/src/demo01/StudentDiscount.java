package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:49 2021/5/27
 * @description
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price*0.8;
    }
}
