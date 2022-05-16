package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:15 2021/5/22
 * @description
 */
public class SimplePhone extends Cellphone{

    @Override
    public void receiveCall(){
        System.out.println("声音提示");
    }
}
