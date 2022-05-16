package demo03;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:52 2021/5/31
 * @description
 */
public class ShotCommand implements Command {

    private Shot shot;

    /**
     * 因为通过工厂来获取此具体命令对象
     * 所以这里不通过传递参数的方法来设置调用者的对象
     * 直接在构造方法中自行创建对象进行引用
     */
    public ShotCommand(){
        shot = new Shot();
    }

    @Override
    public void execute(String keyBoard) {
        shot.shot(keyBoard);
    }
}
