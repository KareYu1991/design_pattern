package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:42 2021/6/1
 * @description
 */
public class DBSynchronizeManagerFactory {

    public static DBSynchronizeManager getManagerFactory(String dbType) {
        String className = Utils048.getName(dbType);
        try {
            return (DBSynchronizeManager)Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
