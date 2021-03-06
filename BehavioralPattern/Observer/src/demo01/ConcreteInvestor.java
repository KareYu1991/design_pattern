package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:19 2021/5/26
 * @description
 */
public class ConcreteInvestor implements Investor {

    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void response(Stock stock) {
        System.out.println("提示股民：" + name + "------股票：" + stock.getStockName() + "价格波动幅度超过5%"
                + "------新价格是：" + stock.getPrice());
    }
}
