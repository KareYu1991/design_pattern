package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:42 2021/5/27
 * @description
 */
public class DepositAccountInterest extends PersonalInterest {
    @Override
    public double calculatedInterest() {
        // System.out.println("定期账户");
        return 1000;
    }
}
