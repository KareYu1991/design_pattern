package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 17:15 2021/5/21
 * @description 公共的抽象构件父类
 */
public abstract class FileElement {

    /**
     * 杀毒操作
     */
    public abstract void antivirusOperation();

    /**
     * 添加子构件
     * @param file 子构件
     */
    public abstract void add(FileElement file);

    /**
     * 移除子构件
     * @param file 子构件
     */
    public abstract void remove(FileElement file);
}
