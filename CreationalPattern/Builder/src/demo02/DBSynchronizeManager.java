package demo02;

import java.util.List;
import java.util.Map;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:35 2021/6/1
 * @description
 */
public abstract class DBSynchronizeManager {

    protected List synchronizers;

    protected Database srcDB;
    protected Database destDB;
    protected Database ctrDB;

    protected Map syncDataTableConfigs;

    public Database getSrcDB() {
        return srcDB;
    }

    public void setSrcDB(Database srcDB) {
        this.srcDB = srcDB;
    }

    public Database getDestDB() {
        return destDB;
    }

    public void setDestDB(Database destDB) {
        this.destDB = destDB;
    }

    public Database getCtrDB() {
        return ctrDB;
    }

    public void setCtrDB(Database ctrDB) {
        this.ctrDB = ctrDB;
    }

    public void addSynchronizer(){
        // synchronizers.add()
    }

    public void removeSynchronizer(){
        // synchronizers.remove()
    }

    public List getSynchronizers() {
        return synchronizers;
    }

    public void setSynchronizers(List synchronizers) {
        this.synchronizers = synchronizers;
    }

    public Map getSyncDataTableConfigs() {
        return syncDataTableConfigs;
    }

    public void setSyncDataTableConfigs(Map syncDataTableConfigs) {
        this.syncDataTableConfigs = syncDataTableConfigs;
    }

    /**
     * 数据库同步方法
     */
    public abstract void executeSyn();
}
