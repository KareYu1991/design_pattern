package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:19 2021/5/27
 * @description
 */
public interface Iterator {

    void next();

    boolean isLast();

    void previous();

    boolean ifFirst();

    Object getNextItem();

    Object getPreviousItem();
}
