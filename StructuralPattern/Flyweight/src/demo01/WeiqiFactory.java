package demo01;

import java.util.HashMap;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 20:58 2021/5/21
 * @description 享元工厂类
 */
public class WeiqiFactory {

    //创建存储享元角色的集合
    private HashMap<String,ChessPieces> piecesHashMap = new HashMap<String,ChessPieces>();

    /**
     * 构造方法，通过单例方法获取享元对象存放到集合中
     */
    public WeiqiFactory() {
        piecesHashMap.put("白棋", WhitePieces.getInstance());
        piecesHashMap.put("黑棋", BlackPieces.getInstance());
    }

    /**
     * 通过工厂方法获取享元角色返回
     * @param piecesType
     * @return
     */
    public ChessPieces getPieces(String piecesType) {
        //因为只有黑棋白棋 所有不需要判断key是否存在，也不需要创建新的棋子类型存储到集合
        if ("白棋".equals(piecesType)){
            return piecesHashMap.get(piecesType);
        }else if("黑棋".equals(piecesType)){
            return piecesHashMap.get(piecesType);
        }else {
            //没有返回空
            return null;
        }
    }
}
