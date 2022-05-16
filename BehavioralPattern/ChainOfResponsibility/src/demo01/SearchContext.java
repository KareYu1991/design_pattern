package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:33 2021/5/26
 * @description 职责链模式 - 抽象处理者
 */
public abstract class SearchContext {

    /**
     * 维护一个自身类型的引用，用于传递使用子类
     */
    protected SearchContext successor;

    public void setSuccessor(SearchContext successor) {
        this.successor = successor;
    }

    /**
     * 处理业务的方法
     * @param keyword
     */
    public abstract void search(String keyword);
}
