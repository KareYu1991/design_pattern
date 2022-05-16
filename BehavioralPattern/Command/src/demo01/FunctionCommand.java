package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:48 2021/5/26
 * @description
 */
public class FunctionCommand {

    /**
     * 获取真实的按键功能
     *
     * @return
     */
    public static Command getConcreteCommand() {
        Command command = null;
        try {
            command = (Command) Utils048.getActor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return command;
    }
}
