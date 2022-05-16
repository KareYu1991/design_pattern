package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:15 2021/5/22
 * @description
 */
class PhoneDecorator extends Cellphone {

    private Cellphone phone = null;

    public PhoneDecorator(Cellphone phone) {
        if (phone != null) {
            this.phone = phone;
        } else {
            this.phone = new SimplePhone();
        }
    }

    @Override
    public void receiveCall() {
        phone.receiveCall();
    }
}
