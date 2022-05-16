package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:34 2021/6/1
 * @description
 */
public abstract class AbstractBuilder {

    protected DBSynchronizeManager dbSynchronizeManager;

    /**
     * 从工厂中获取一个有具体类型的初始化对象
     */
    public void builderLife(){
        System.out.println("初始化了一个DBSynchronizeManager对象");
        dbSynchronizeManager = DBSynchronizeManagerFactory.getManagerFactory("Oracle");
    };

    /**
     * 组装
     */
    public abstract void builderDatabase();
    public abstract void builderDBSynchronizer();
    public abstract void builderSynDataTableConfigs();


    /**
     * 组装完成，返回对象
     * @return
     */
    public DBSynchronizeManager createManager(){
        builderLife();
        builderDatabase();
        builderDBSynchronizer();
        builderSynDataTableConfigs();
        return dbSynchronizeManager;
    };
}
