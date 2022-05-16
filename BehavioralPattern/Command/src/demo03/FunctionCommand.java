package demo03;


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
    public static Command getConcreteCommand(String key) {
        Command command = null;
        try {
            command = (Command) Utils048.getActor(key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return command;
    }
}
