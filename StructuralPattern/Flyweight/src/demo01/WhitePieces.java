package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:50 2021/5/21
 * @description
 */
public class WhitePieces implements ChessPieces {

    //棋子类型(颜色)
    private String piecesType = "白棋";

    //私有对象
    private static WhitePieces instance = null;

    //私有构造
    private WhitePieces() {
    }

    //单例模式获取唯一的对象
    public static WhitePieces getInstance() {
        if (instance == null) {
            instance = new WhitePieces();
        }
        return instance;
    }

    @Override
    public void chessMoves() {
        System.out.println("棋子颜色: " + piecesType);
    }
}
