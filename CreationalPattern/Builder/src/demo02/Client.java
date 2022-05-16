package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:01 2021/6/1
 * @description
 */
public class Client {

    public static void main(String[] args) {

        AbstractBuilder abstractBuilder = new OracleDBSynchronizeManagerBuilder();

        DBSynchronizeManager manager = abstractBuilder.createManager();

        manager.executeSyn();
    }
}
