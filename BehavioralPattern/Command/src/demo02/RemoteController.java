package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:41 2021/5/28
 * @description
 */
public class RemoteController {

    protected Command[] commands = new Command[4];

    public void onPressButton(int button) {
        if (button % 2 == 0) {
            commands[button].on();
        } else {
            commands[button].off();
        }

    }

    public void setCommands(int button,Command command) {
        this.commands[button] = command;
    }
}
