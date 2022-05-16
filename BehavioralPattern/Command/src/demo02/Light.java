package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:48 2021/5/28
 * @description
 */
public class Light {

    public void turnLight(int degree) {
        if (degree <= 0) {
            System.out.println("关灯");
        } else if (degree >= 100) {
            System.out.println("开灯 - 亮度最大");
        }
    }
}
