package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:59 2021/6/1
 * @description
 */
public class SqlServerDBSynchronizeManagerBuilder extends AbstractBuilder {
    @Override
    public void builderDatabase() {
        System.out.println("建造了SqlServer数据库对象");
        dbSynchronizeManager.setSrcDB(null);
        dbSynchronizeManager.setDestDB(null);
        dbSynchronizeManager.setCtrDB(null);
    }

    @Override
    public void builderDBSynchronizer() {
        System.out.println("建造了SqlServer数据库同步对象");
        dbSynchronizeManager.setSynchronizers(null);
    }

    @Override
    public void builderSynDataTableConfigs() {
        System.out.println("建造了SqlServer数据库同步配置");
        dbSynchronizeManager.setSyncDataTableConfigs(null);
    }
}
