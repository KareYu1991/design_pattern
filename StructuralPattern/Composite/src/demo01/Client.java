package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 16:49 2021/5/21
 * @description 组合模式 - 杀毒软件
 * <p>
 * 使用组合模式设计一个杀毒软件（AntiVirus）的框架，该软件即可以对某个文件夹（Folder）杀毒，
 * 也可以对某个指定的文件（File）进行杀毒，文件种类包括文本文件TextFile，图片文件ImageFile，视频文件VideoFile，
 * 绘制类图并编程模拟实现。
 */
public class Client {

    public static void main(String[] args) {

        FileElement fo01 = new Folder("Sunny的资料");
        fo01.antivirusOperation();

        FileElement fo02, tu01, tu02;
        fo02 = new Folder("图像文件");
        tu01 = new ImageFile("小龙女.jpg");
        tu02 = new ImageFile("张无忌.gif");
        fo02.add(tu01);
        fo02.add(tu02);
        fo02.antivirusOperation();

        FileElement fo03, te01, te02;
        fo03 = new Folder("文本文件");
        te01 = new TextFile("九阴真经.txt");
        te02 = new TextFile("葵花宝典.doc");
        fo03.add(te01);
        fo03.add(te02);
        fo03.antivirusOperation();

        FileElement fo04, vi01;
        fo04 = new Folder("视频文件");
        vi01 = new VideoFile("笑傲江湖.rmvb");
        fo04.add(vi01);
        fo04.antivirusOperation();

    }
}
