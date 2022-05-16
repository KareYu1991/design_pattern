package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:51 2021/5/21
 * @description 操作适配器 - 适配器类
 */
public class OperationAdapter implements DataOperation {

    public QuickSort sortObj;

    public BinarySearch searchObj;

    /**
     * 构造方法传递适配者类
     * @param sortObj
     * @param searchObj
     */
    public OperationAdapter(QuickSort sortObj, BinarySearch searchObj) {
        this.sortObj = sortObj;
        this.searchObj = searchObj;
    }

    /**
     * 排序方法
     * @param array
     * @return
     */
    @Override
    public int[] sort(int[] array) {
        //使用新的适配者的快速排序方法
        return sortObj.quickSort(array);
    }

    /**
     * 查找方法
     * @param array
     * @param key
     * @return
     */
    @Override
    public int search(int[] array, int key) {
        //使用新的适配者的二分查找方法
        return searchObj.binarySearch(array, key);
    }
}
