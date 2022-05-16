package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:52 2021/6/1
 * @description
 */
public class SqlServerDBSynchronizeManager extends DBSynchronizeManager {
    @Override
    public void executeSyn() {
        System.out.println("使用SQLserver管理器数据库同步");
    }
}
