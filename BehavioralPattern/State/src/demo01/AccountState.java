package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 12:53 2021/5/28
 * @description 抽象状态
 */
public abstract class AccountState {

    protected Account account;

    protected static double balance;

    /**
     * 检查余额
     */
    public abstract void stateCheck();

    /**
     * 存款
     *
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        System.out.println(account.getOwner()+" 进行存款: " + amount);
        balance += amount;
        System.out.println(account.getOwner()+" 当前余额为：" + balance);
    }

    /**
     * 取款
     *
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        System.out.println(account.getOwner()+" 进行取款: " + amount);
        balance = balance - amount;
        System.out.println(account.getOwner()+" 当前余额为：" + balance);
    }
}
