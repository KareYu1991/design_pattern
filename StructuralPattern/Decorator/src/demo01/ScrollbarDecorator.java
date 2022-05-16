package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:38 2021/5/21
 * @description 具体装饰类
 */
public class ScrollbarDecorator extends WindowDecorator {

    /**
     * 获取到父类中window的引用
     *
     * @param window
     */
    public ScrollbarDecorator(Window window) {
        super(window);
    }

    /**
     * 新的方法
     */
    public void setScrollbar() {
        System.out.println("给窗体增加滚动条！");
    }


    @Override
    public void display() {
        //方法增强
        setScrollbar();

        super.display();
    }
}
