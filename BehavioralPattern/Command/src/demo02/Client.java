package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:53 2021/5/28
 * @description
 */
public class Client {

    public static void main(String[] args) {

        TV tv = new TV();
        Light light = new Light();

        RemoteController remoteController = new RemoteController();

        Command lightCommand,tvCommand;
        lightCommand = new LightCommand(light);
        tvCommand = new TVCommand(tv);

        //设置0号键是灯
        remoteController.setCommands(0,lightCommand);
        //设置1号键是灯
        remoteController.setCommands(1, lightCommand);

        //按0号键 开灯
        remoteController.onPressButton(0);
        //按1号键 关灯
        remoteController.onPressButton(1);
    }
}
