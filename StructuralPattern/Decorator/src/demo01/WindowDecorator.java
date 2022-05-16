package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:33 2021/5/21
 * @description 抽象装饰类 - 维护了指向父类的引用
 */
public class WindowDecorator extends Window {

    /**
     * 私有的父类引用
     */
    private Window window;

    /**
     * 传递父类的引用
     *
     * @param window
     */
    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void display() {
        window.display();
    }
}
