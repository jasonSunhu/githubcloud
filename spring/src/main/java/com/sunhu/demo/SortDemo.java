package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/9.
 */
public class SortDemo {
    public static void main(String args[]){
        int[] array = {3, 4, 1, 67, 2, 6, 21, 65, 12, 34, 54, 1, 43, 5, 2, 54, 67, 12};
        BullonSort(array);
    }
    public static void BullonSort(int[] array){
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }
}
