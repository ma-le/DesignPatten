package com.male.Sort;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
//        int[] a = {9,8,7,6,5,4,3,2,1};
        int[] a = {5,2,4,6,1,3};
        System.out.println(Arrays.toString(a));
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quicksort(int[] arr, int low, int high){
        int i, j, key;

        if(low > high){
            return;
        }
        i = low;
        j = high;
        key = arr[low];

        while(i < j){
            while (key <= arr[j] && i < j){
                j--;
            }
            while (key >= arr[i] && i < j){
                i++;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = key;

        quicksort(arr, low, j-1);
        quicksort(arr, j+1, high);
    }


}
