package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:14 2021/5/26
 * @description
 */
public class Stock extends SubjectStock {

    private String stockName;

    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void attch(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void detach(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestor() {
        //判断波动超过5%时，进行通知
        for (Investor investor : investors) {
            investor.response(this);
        }
    }
}
