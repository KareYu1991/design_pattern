package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:52 2021/5/28
 * @description
 */
public class Caesar implements Encrypt {

    @Override
    public String algorithm(String data) {
        System.out.println("对密码"+data+"进行了凯撒加密");
        return "凯撒加密";
    }
}
