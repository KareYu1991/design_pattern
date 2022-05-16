package demo02;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:36 2021/6/1
 * @description
 */
public class DBSynchronizeManagerDirector {

    private AbstractBuilder builder;

    /**
     * 指挥进行创建
     * @return
     */
    public DBSynchronizeManager contstruct(){
        return builder.createManager();
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }
}
