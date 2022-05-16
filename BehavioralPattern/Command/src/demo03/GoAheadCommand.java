package demo03;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:52 2021/5/31
 * @description
 */
public class GoAheadCommand implements Command {

    private GoAhead goAhead;

    public GoAheadCommand() {
        goAhead = new GoAhead();
    }

    @Override
    public void execute(String keyBoard) {
        goAhead.goAhead(keyBoard);
    }
}
