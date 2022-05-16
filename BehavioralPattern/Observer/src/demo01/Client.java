package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:32 2021/5/26
 * @description
 */
public class Client {

    public static void main(String[] args) {

        SubjectStock stock = new Stock("青岛海尔", 25.0);

        Investor investor01, investor02;
        investor01 = new ConcreteInvestor("杨过");
        investor02 = new ConcreteInvestor("小龙女");

        stock.attch(investor01);
        stock.attch(investor02);

        stock.notifyInvestor();
    }
}
