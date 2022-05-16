package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 16:47 2021/5/21
 * @description 享元模式 - 围棋软件
 * <p>
 * 使用享元模式设计一个围棋软件，
 * 在系统中只存在一个白棋对象和一个黑棋对象，但是它们可以在棋盘的不同位置显示多次。
 * 要求使用简单工厂模式和单例模式实现享元工厂类的设计。
 */
public class Client {

    public static void main(String[] args) {

        WeiqiFactory weiqiFactory = new WeiqiFactory();

        ChessPieces b01 = weiqiFactory.getPieces("黑棋");
        ChessPieces b02 = weiqiFactory.getPieces("黑棋");

        ChessPieces w01 = weiqiFactory.getPieces("白棋");
        ChessPieces w02 = weiqiFactory.getPieces("白棋");

        System.out.println("判断两颗黑子是否相同：" + b01.equals(b02));
        System.out.println("判断两颗白子是否相同：" + w01.equals(w02));

        ChessPieces b03 = weiqiFactory.getPieces("黑棋");

        b01.chessMoves();
        b02.chessMoves();
        b03.chessMoves();
        w01.chessMoves();
        w02.chessMoves();
    }
}
