package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:28 2021/5/21
 * @description 装饰模式 - 界面显示构件库
 * <p>
 * 某软件公司基于面向对象技术开发一套图形界面显示构件库VisualComponent。
 * 在使用该库构建某图形界面时，用户要求为界面定制一些特效显示效果，如带流动条的窗体或透明窗体等。
 * 现使用装饰模式设计该构件库，绘制类图并编程模拟实现。
 */
public class Client {

    public static void main(String[] args) {

        //创建具体构件类的对象
        Window simpleWindow = new SimpleWindow();

        //传递具体构件类对象 - 第二次装饰
        Window scrollbarDecorator = new ScrollbarDecorator(simpleWindow);

        //传递具体构件类对象 - 第一次装饰
        Window transparentDecorator = new TransparentDecorator(scrollbarDecorator);

        //装饰后执行显示方法
        transparentDecorator.display();
    }
}
