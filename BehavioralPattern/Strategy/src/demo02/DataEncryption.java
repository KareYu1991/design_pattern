package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 22:52 2021/5/28
 * @description
 */
public class DataEncryption {

    private String data;

    private Encrypt encrypt;

    public void setEncrypt(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    public String getData() {
        return encrypt.algorithm(data);
    }

    public void setData(String data) {
        this.data = data;
    }
}
