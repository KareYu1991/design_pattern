package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:40 2021/5/22
 * @description
 */
public class Picture implements AbstractApplication {

    private Application application;

    public Picture(){
        application = new Application();
    }

    @Override
    public void run() {
        System.out.println("通过图片快捷方式运行: ");
        application.run();
    }
}
