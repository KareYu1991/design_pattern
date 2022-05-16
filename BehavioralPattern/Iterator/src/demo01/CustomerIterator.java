package demo01;

import java.util.List;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:26 2021/5/27
 * @description
 */
public class CustomerIterator implements Iterator {

    private CustomerList customerList;

    private List<Object> customers;

    private int cursor1;
    private int cursor2;

    public CustomerIterator(CustomerList customerList) {
        this.customerList = customerList;
        this.customers = customerList.getObjects();
        cursor1 = 0;
        cursor2 = customers.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < customers.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == customers.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean ifFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNextItem() {
        return customers.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return customers.get(cursor2);
    }
}
