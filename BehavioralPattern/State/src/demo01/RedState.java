package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 13:13 2021/5/28
 * @description
 */
public class RedState extends AccountState {

    public RedState(Account accounts) {
        account = accounts;
    }

    @Override
    public void stateCheck() {
        if (balance < 0 & balance >= -1000) {
            account.setState(new YellowState(account));
        } else if (balance > 0) {
            account.setState(new GreenState(account));
        }
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(account.getOwner()+" 当前余额为: " + balance + "不能取款");
        stateCheck();
    }
}
