package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:45 2021/5/26
 * @description
 */
public class Client {

    public static void main(String[] args) {

        KeyBoard keyBoard = new KeyBoard();

        Command command = FunctionCommand.getConcreteCommand();

        keyBoard.setCommand(command);

        keyBoard.useFunctionButton();
    }
}
