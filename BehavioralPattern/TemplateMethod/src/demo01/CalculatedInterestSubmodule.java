package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:43 2021/5/27
 * @description
 */
public class CalculatedInterestSubmodule {

    public static void main(String[] args) {

        PersonalInterest personalInterest = new CurrentAccountInterest();

        personalInterest.TemplateMethod("张三", "123456");

    }
}
