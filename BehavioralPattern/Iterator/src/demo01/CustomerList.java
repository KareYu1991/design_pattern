package demo01;

import java.util.List;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:23 2021/5/27
 * @description
 */
public class CustomerList extends AbstractObjectList {

    public CustomerList(List<Object> customerList) {
        super(customerList);
    }

    @Override
    public Iterator getIterator() {
        return new CustomerIterator(this);
    }
}
