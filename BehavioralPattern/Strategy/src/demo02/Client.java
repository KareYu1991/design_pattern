package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:53 2021/5/28
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Encrypt des, caesar;
        caesar = new Caesar();

        DataEncryption dataEncryption = new DataEncryption();

        dataEncryption.setData("123456");

        dataEncryption.setEncrypt(caesar);

        dataEncryption.getData();

    }
}
