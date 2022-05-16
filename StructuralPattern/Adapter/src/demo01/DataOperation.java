package demo01;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:49 2021/5/21
 * @description 数据操作接口 - 目标类
 */
public interface DataOperation {

    /**
     * 排序
     *
     * @param array
     * @return
     */
    int[] sort(int[] array);

    /**
     * 查找
     *
     * @param array
     * @param key
     * @return
     */
    int search(int[] array, int key);

}
