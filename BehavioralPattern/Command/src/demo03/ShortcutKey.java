package demo03;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:50 2021/5/31
 * @description
 */
public class ShortcutKey {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按下功能键
     * @param keyBoard 具体的按键
     */
    public void keyDown(String keyBoard){
        command.execute(keyBoard);
    }
}
