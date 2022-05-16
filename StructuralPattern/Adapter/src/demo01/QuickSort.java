package demo01;

import java.util.Arrays;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 15:09 2021/5/21
 * @description 适配者类
 */
public class QuickSort {

    public int[] quickSort(int[] array){
        Arrays.sort(array);
        return array;
    }

    public void sort(int[] array,int p,int r){
        System.out.println("进行了排序");
    }

    public int partition(int[] a,int p,int r){
        System.out.println("进行了分割");
        return 0;
    }

    public void swap(int[] a,int i,int j){
        System.out.println("进行了交换");
    }
}
