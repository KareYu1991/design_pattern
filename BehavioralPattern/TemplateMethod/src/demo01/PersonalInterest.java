package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:32 2021/5/27
 * @description
 */
public abstract class PersonalInterest {

    public void TemplateMethod(String username, String password) {
        boolean flag = verifyAccount(username, password);
        if (flag) {
            calculatedInterest();
            showInterest();
        }
    }

    /**
     * 验证账户
     *
     * @param username
     * @param password
     */
    public boolean verifyAccount(String username, String password) {
        if ("张三".equals(username) && "123456".equals(password)) {
            System.out.println("成功验证");
            return true;
        }else {
            System.out.println("错误！ 检查账户是否正确");
            return false;
        }
    }

    /**
     * 计算利息返回
     * @return
     */
    public abstract double calculatedInterest();

    public void showInterest() {
        double v = calculatedInterest();
        System.out.println("账户利息为 "+v);
    }
}
