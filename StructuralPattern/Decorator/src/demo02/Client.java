package demo02;

public class Client {

    public static void main(String a[]) {
        //创建具有声音提示的手机
        Cellphone p1 = new SimplePhone();
        p1.receiveCall();

        System.out.println("-----");

        //创建具有声音提示和振动提示的手机
        Cellphone p2 = new JarPhone(p1);
        p2.receiveCall();

        System.out.println("-----");

        //创建具有声音提示、振动提示和灯光提示的手机
        Cellphone p3 = new ComplexPhone(p2);
        p3.receiveCall();
    }
}
