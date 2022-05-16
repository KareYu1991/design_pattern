package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:47 2021/5/28
 * @description
 */
public class TV {

    public void setChannel(int channel){
        if (channel == 0) {
            System.out.println("关机");
        } else if (channel == 1) {
            System.out.println("开机");
        }
    }
}
