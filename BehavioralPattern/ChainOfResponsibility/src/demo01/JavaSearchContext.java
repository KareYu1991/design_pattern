package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:37 2021/5/26
 * @description 具体处理者
 */
public class JavaSearchContext extends SearchContext {

    /**
     * 具体的处理方法
     *
     * @param keyword
     */
    @Override
    public void search(String keyword) {
        if (keyword.length() < 3) {
            System.out.println("Java查询关键字 " + keyword);
        } else {
            successor.search(keyword);
        }
    }
}
