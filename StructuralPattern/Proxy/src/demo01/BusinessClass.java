package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 16:28 2021/5/21
 * @description 真实主题对象
 */
public class BusinessClass implements AbstractLog {

    @Override
    public void method() {
        System.out.println("真实业务方法");
    }
}
