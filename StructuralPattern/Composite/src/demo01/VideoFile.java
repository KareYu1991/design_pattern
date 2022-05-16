package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 17:28 2021/5/21
 * @description
 */
public class VideoFile extends FileElement {

    private String fileName;

    public VideoFile(String fileName) {
        this.fileName = "'" + fileName + "'";
    }

    @Override
    public void antivirusOperation() {
        System.out.println("----对视频文件" + fileName + "进行杀毒");
    }

    @Override
    public void add(FileElement file) {
    }

    @Override
    public void remove(FileElement file) {
    }
}
