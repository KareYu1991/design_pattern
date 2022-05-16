package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:45 2021/5/26
 * @description
 */
public class KeyBoard {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void useFunctionButton(){
        command.execute();
    }
}
