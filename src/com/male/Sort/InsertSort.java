package com.male.Sort;

import java.util.Arrays;

public class InsertSort {

    private BubbleSort bubbleSort;

    public BubbleSort getBubbleSort() {
        return bubbleSort;
    }

    public void setBubbleSort(BubbleSort bubbleSort){
        this.bubbleSort = bubbleSort;
    }

    public static void main(String[] args) {
//        int[] a = {9,8,7,6,5,4,3,2,1};
        int[] a = {5,2,6,3};
        System.out.println(Arrays.toString(a));
        insertsort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertsort(int[] arr) {






        int i, j, key;
        for (i = 1; i < arr.length; i++){
            j = i;
            key = arr[i];

            while (j > 0 && key < arr[j - 1]){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }








    }

//    int i, j;
//    int length = arr.length;
//    int key;
//
//        for(i = 1; i < length; i++){
//        j = i;
//        key = arr[i];
//
//        while (j > 0 && key < arr[j - 1]){
//            arr[j] = arr[j-1];
//            j--;
//        }
//
//        arr[j] = key;
//    }
}
