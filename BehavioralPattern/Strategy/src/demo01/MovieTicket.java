package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:50 2021/5/27
 * @description
 */
public class MovieTicket {

    private Discount discount;

    private double price;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *  调用策略对象获取具体的价格
     * @return
     */
    public double getPrice() {
        return discount.calculate(price);
    }

}
