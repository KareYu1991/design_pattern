package demo01;

import java.util.ArrayList;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:34 2021/5/27
 * @description
 */
public class Client {

    public static void main(String[] args) {

        AbstractObjectList productList, customerList;

        productList = new ProductList(new ArrayList<>());
        productList.addObject("商品01");
        productList.addObject("商品02");
        productList.addObject("商品03");
        productList.addObject("商品04");
        Iterator productListIterator = productList.getIterator();

        while (!productListIterator.isLast()) {
            System.out.println(productListIterator.getNextItem());
            productListIterator.next();
        }

        System.out.println("============");

        customerList = new CustomerList(new ArrayList<>());
        customerList.addObject("顾客01");
        customerList.addObject("顾客02");
        customerList.addObject("顾客03");
        Iterator customerListIterator = customerList.getIterator();

        while (!customerListIterator.isLast()) {
            System.out.println(customerListIterator.getNextItem());
            customerListIterator.next();
        }

    }
}
