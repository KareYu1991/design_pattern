package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 12:52 2021/5/28
 * @description 状态模式 - 银行账户 - 上下文环境类(包含状态)
 */
public class Account {

    /**
     * 状态对象
     */
    private AccountState state;

    /**
     * 账户名
     */
    private String owner;

    public String getOwner() {
        return owner;
    }

    public Account(String owner, double init) {
        this.owner = owner;
        if (init > 0) {
            state = new GreenState(this);
            state.balance = init;
        } else if (init < 0 & init > -1000) {
            state = new YellowState(this);
            state.balance = init;
        } else {
            state = new RedState(this);
            state.balance = init;
        }
    }

    /**
     * 设置状态对象
     *
     * @param state
     */
    public void setState(AccountState state) {
        this.state = state;
    }

    /**
     * 存款
     *
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        state.deposit(amount);
        state.stateCheck();
    }

    /**
     * 取款
     *
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        state.withdraw(amount);
        state.stateCheck();
    }

}
