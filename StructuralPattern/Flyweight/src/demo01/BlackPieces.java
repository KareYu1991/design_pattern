package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:50 2021/5/21
 * @description
 */
public class BlackPieces implements ChessPieces {
    //棋子类型(颜色)
    private String piecesType = "黑棋";;

    //私有对象
    private static BlackPieces instance = null;

    //私有构造
    private BlackPieces() {
    }

    //单例模式获取唯一的对象
    public static BlackPieces getInstance() {
        if (instance == null) {
            instance = new BlackPieces();
        }
        return instance;
    }

    @Override
    public void chessMoves() {
        System.out.println("棋子颜色: " + piecesType);
    }
}
