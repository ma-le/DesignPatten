package com.male.Sort;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快排1
     */
    public static void main(String[] args) {
//        int[] a = {9,8,7,6,5,4,3,2,1};
        int[] a = {3,5,2,4,7,9,6,1,8};
        System.out.println(Arrays.toString(a));
        quick(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int [] arr, int start, int end){



        if(start < end){
            int i = start;
            int j ;
            int key = arr[start];

            for (j = i + 1; j <= end; j++){
                if(arr[j] < key){
                    int temp = arr[j];
                    arr[j] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++;
                }
            }
            arr[start] = arr[i];
            arr[i] = key;

            quick(arr, start, i - 1);
            quick(arr, i + 1, end);
        }




    }

//    if(start < end){
//        int i = start;
//        int j;
//        int key = arr[start];
//
//        for(j = start+1; j <= end; j++) {
//            if (arr[j] < key) {
//                int temp = arr[j];
//                arr[j] = arr[i + 1];
//                arr[i + 1] = temp;
//                i++;
//            }
//        }
//        arr[start] = arr[i];
//        arr[i] = key;
//
//        quick(arr, start, i-1);
//        quick(arr, i+1, end);
//    }
}
