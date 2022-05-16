package demo03;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:57 2021/5/31
 * @description
 */
public class Client {

    public static void main(String[] args) {

        ShortcutKey shortcutKey = new ShortcutKey();

        /**
         * 传递具体要设置哪一个按键，相当于说明要修改哪一个键
         * 并且通过工厂方法并获取命令对象
         */
        Command command = FunctionCommand.getConcreteCommand("w");

        //设置命令对象
        shortcutKey.setCommand(command);

        //执行w键
        shortcutKey.keyDown("w");

    }
}
