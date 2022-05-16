package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:41 2021/5/21
 * @description 具体装饰类
 */
public class TransparentDecorator extends WindowDecorator {

    public TransparentDecorator(Window window) {
        super(window);
    }

    /**
     * 新的方法
     */
    public void setScrollbar() {
        System.out.println("将窗体设置为透明窗体！");
    }

    @Override
    public void display() {
        //方法增强
        setScrollbar();
        super.display();
    }
}
