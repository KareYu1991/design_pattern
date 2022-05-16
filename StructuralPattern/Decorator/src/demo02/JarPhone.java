package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:15 2021/5/22
 * @description
 */
public class JarPhone extends PhoneDecorator{

    public JarPhone(Cellphone phone){
        super(phone);
    }

    @Override
    public void receiveCall(){
        super.receiveCall();
        System.out.println("振动提示");
    }
}
