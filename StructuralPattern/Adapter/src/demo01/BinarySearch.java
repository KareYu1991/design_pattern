package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:09 2021/5/21
 * @description 适配者类 就是原来接口希望实现新方法的对象
 */
public class BinarySearch {

    /**
     * 一维数组二分查找
     * 前提：数组已经排好序
     * 首先确定 第一个索引star和最后一个索引end 还有中间索引mid
     * 然后比较key与mid，大于循环mid右边再比较,小于循环mid左边再比较
     * 最终找到对应的值
     *
     * @param array
     * @param key
     * @return
     */
    public int binarySearch(int[] array, int key) {

        System.out.println("查找关键字"+key);

        int starIndex = 0;
        int endIndex = array.length - 1;
        int midIndex = (starIndex + endIndex) / 2;
        int mid = array[midIndex];
        int flag = -1;

        while (starIndex <= endIndex) {
            if (key < array[midIndex]) {
                endIndex = midIndex - 1;
            } else if (key > array[midIndex]) {
                starIndex = midIndex + 1;
            } else {
                mid = array[midIndex];
                flag = 1;
                break;
            }
            midIndex = (starIndex + endIndex) / 2;
        }

        if (flag == -1) {
            System.out.println("没有找到关键字"+key);
            return flag;
        }

        System.out.println("找到关键字"+key);
        return midIndex;
    }
}
