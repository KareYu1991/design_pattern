package demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 16:28 2021/5/21
 * @description 代理主题对象 - 对真实主题进行代理增强
 */
public class LoggerProxy implements AbstractLog {

    //真实代理对象
    private BusinessClass businessClass;

    public LoggerProxy() {
        // 创建真实的代理对象
        businessClass = new BusinessClass();
    }

    /**
     * 对真实代理对象其业务进行增强
     */
    @Override
    public void method() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("方法method()被调用,调用时间为" + simpleDateFormat.format(new Date()));

            //调用真实方法
            businessClass.method();

            System.out.println("方法method()调用成功");
        } catch (Exception e) {
            e.printStackTrace();
            //异常处理
            System.out.println("方法method()调用失败");
        }
    }
}
