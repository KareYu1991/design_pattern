package demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 17:18 2021/5/21
 * @description 容器构件
 */
public class Folder extends FileElement {

    //文件夹名称
    private String folderName;

    /**
     * 所有的构件集合
     */
    private List<FileElement> fileArray = new ArrayList<FileElement>();

    public Folder(String folderName) {
        this.folderName = "'" + folderName + "'";
    }

    /**
     * 添加子构件
     * @param file 子构件
     */
    @Override
    public void add(FileElement file) {
        fileArray.add(file);
    }

    /**
     * 移除子构件
     * @param file 子构件
     */
    @Override
    public void remove(FileElement file) {
        fileArray.remove(file);
    }

    /**
     * 进行构件的操作
     */
    @Override
    public void antivirusOperation() {

        System.out.println("****对文件夹" + folderName + "进行杀毒");

        //遍历容器构件中所有构件的集合
        for (FileElement fileElement : fileArray) {
            //递归执行子构件的操作
            fileElement.antivirusOperation();
        }
    }

}
