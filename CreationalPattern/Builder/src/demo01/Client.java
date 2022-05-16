package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:09 2021/5/23
 * @description
 */
public class Client {

    public static void main(String[] args) {

        AbstractBuilder abstractBuilder = new ConcreteBuilderLaptop();

        Director director = new Director(abstractBuilder);

        Computer constructComputer = director.construct();

        System.out.println("建造了电脑："+constructComputer);
    }
}
