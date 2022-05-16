package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 13:20 2021/5/28
 * @description
 */
public class Client {

    public static void main(String[] args) {

        //初始状态 余额大于0 green状态
        Account account = new Account("张三", 100);

        //取款1100 余额-1000 yellow状态
        account.withdraw(1100);

        //取款100 余额-100 red状态
        account.withdraw(100);

        // 取款10 不能再取款
        account.withdraw(10);

    }
}
