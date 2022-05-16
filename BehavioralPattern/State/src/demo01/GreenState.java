package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 13:13 2021/5/28
 * @description
 */
public class GreenState extends AccountState {

    public GreenState(Account accounts) {
        account = accounts;
    }

    @Override
    public void stateCheck() {
        if (balance < 0 & balance >= -1000) {
            account.setState(new YellowState(account));
        } else if (balance < -1000) {
            account.setState(new RedState(account));
        }
    }

}
