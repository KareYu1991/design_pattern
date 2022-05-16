package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:50 2021/5/27
 * @description
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("增加积分");
        return price * 0.5;
    }
}
