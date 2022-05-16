package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:38 2021/5/26
 * @description
 */
public class Client {

    public static void main(String[] args) {

        SearchContext javaSearch, sqlSearch, umlSearch;

        javaSearch = new JavaSearchContext();
        sqlSearch = new SQLSearchContext();
        umlSearch = new UMLSearchContext();

        //设置职责链顺序
        javaSearch.setSuccessor(sqlSearch);
        sqlSearch.setSuccessor(umlSearch);

        javaSearch.search("123456");
    }
}
