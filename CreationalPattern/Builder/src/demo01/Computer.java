package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 19:59 2021/5/23
 * @description 具体产品类
 */
public class Computer {

    private String type;

    private double price;

    private String parts;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", parts='" + parts + '\'' +
                '}';
    }
}
