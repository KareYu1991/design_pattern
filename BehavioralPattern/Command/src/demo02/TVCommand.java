package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:46 2021/5/28
 * @description
 */
public class TVCommand implements Command {

    private TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.setChannel(1);
    }

    @Override
    public void off() {
        tv.setChannel(0);
    }
}
