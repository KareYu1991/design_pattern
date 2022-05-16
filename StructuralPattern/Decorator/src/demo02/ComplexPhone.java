package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:15 2021/5/22
 * @description
 */
public class ComplexPhone extends PhoneDecorator {

    public ComplexPhone(Cellphone phone) {
        super(phone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("灯光闪烁提示");
    }
}
