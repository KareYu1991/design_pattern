package demo01;

import java.util.ArrayList;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:12 2021/5/26
 * @description
 */
public abstract class SubjectStock {

    protected ArrayList<Investor> investors = new ArrayList<Investor>();

    /**
     * 添加观察者
     *
     * @param investor
     */
    public abstract void attch(Investor investor);

    /**
     * 移除观察者
     *
     * @param investor
     */
    public abstract void detach(Investor investor);

    /**
     * 通知方法
     */
    public abstract void notifyInvestor();

}
