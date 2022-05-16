package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 13:07 2021/5/28
 * @description
 */
public class YellowState extends AccountState {

    public YellowState(Account accounts) {
        account = accounts;
    }

    /**
     * 检查余额-判断当前账户状态
     */
    @Override
    public void stateCheck() {
        if (balance < -1000) {
            account.setState(new RedState(account));
        } else if (balance > 0) {
            account.setState(new GreenState(account));
        }
    }

}
