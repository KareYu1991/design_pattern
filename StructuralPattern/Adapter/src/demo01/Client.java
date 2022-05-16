package demo01;

import java.util.Arrays;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 14:47 2021/5/21
 * @description 对象适配器 - 算法适配
 * <p>
 * 说明：
 * 现有一个接口DataOperation定义了排序方法sort(int[])和查找方法search(int[],int)，
 * 已知类QuickSort的quickSort(int[])方法实现了快速排序算法，
 * 类BinarySearch的binarySearch(int[],int)方法实现了二分查找算法。
 * 现使用适配器模式设计一个系统，在不修改源代码的情况下将类QuickSort和类BinarySearch的方法适配到DataOperation接口中。
 * 绘制类图，并编程实现。
 */
public class Client {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        BinarySearch binarySearch = new BinarySearch();

        DataOperation dataOperation = new OperationAdapter(quickSort, binarySearch);

        int[] array = {15,13,17,26,24,36,68,34};

        int[] sortArrays = dataOperation.sort(array);

        System.out.println("排序结果: \n"+ Arrays.toString(sortArrays));
        dataOperation.search(sortArrays, 24);
        dataOperation.search(sortArrays, 25);

    }

}
