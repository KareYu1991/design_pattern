package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:42 2021/5/26
 * @description
 */
public class DisplayHelpCommand implements Command {

    private DisplayHelpClass displayHelpClass;

    public DisplayHelpCommand() {
        displayHelpClass = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        displayHelpClass.displayHelp();
    }
}
