package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:53 2021/5/27
 * @description
 */
public class Client {

    public static void main(String[] args) {

        MovieTicket movieTicket01 = new MovieTicket();
        // 设置电影票价格
        movieTicket01.setPrice(50);

        Discount childrenTicket, studentTicket, VIPTicket;

        childrenTicket = new ChildrenDiscount();

        movieTicket01.setDiscount(childrenTicket);

        System.out.println("儿童优惠票价为：" + movieTicket01.getPrice());


        System.out.println("==========");

        MovieTicket movieTicket02 = new MovieTicket();
        movieTicket02.setPrice(50);

        VIPTicket = new VIPDiscount();

        movieTicket02.setDiscount(VIPTicket);
        System.out.println("VIP优惠票价为：" + movieTicket02.getPrice());


    }
}
