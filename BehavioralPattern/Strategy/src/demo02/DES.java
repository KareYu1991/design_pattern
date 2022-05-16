package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:52 2021/5/28
 * @description
 */
public class DES implements Encrypt {


    @Override
    public String algorithm(String data) {
        System.out.println("对密码"+data+"进行了des加密");
        return "des加密";
    }
}
