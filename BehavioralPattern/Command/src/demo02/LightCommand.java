package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:46 2021/5/28
 * @description
 */
public class LightCommand implements Command {

    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void on() {
        light.turnLight(100);
    }

    @Override
    public void off() {
        light.turnLight(0);
    }
}
