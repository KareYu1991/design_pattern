package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:52 2021/6/1
 * @description
 */
public class OracleDBSynchronizeManager extends DBSynchronizeManager {

    @Override
    public void executeSyn() {
        System.out.println("使用oracle管理器数据库同步");
    }
}
