package demo01;

import java.util.List;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:21 2021/5/27
 * @description
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> productList) {
        super(productList);
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this);
    }
}
