package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 21:42 2021/5/27
 * @description
 */
public class CurrentAccountInterest extends PersonalInterest {
    @Override
    public double calculatedInterest() {
        // System.out.println("活期账户");
        return 800;
    }
}
