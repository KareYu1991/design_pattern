package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:40 2021/5/26
 * @description
 */
public class SystemExitCommand implements Command {

    private SystemExitClass systemExitClass;

    public SystemExitCommand() {
        systemExitClass = new SystemExitClass();
    }

    @Override
    public void execute() {
        systemExitClass.systemExit();
    }
}
