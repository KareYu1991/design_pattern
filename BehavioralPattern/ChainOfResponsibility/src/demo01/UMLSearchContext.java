package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:37 2021/5/26
 * @description
 */
public class UMLSearchContext extends SearchContext {

    @Override
    public void search(String keyword) {
        if (keyword.length() >= 5) {
            System.out.println("UML查询关键字 " + keyword);
        } else {
            successor.search(keyword);
        }
    }
}
