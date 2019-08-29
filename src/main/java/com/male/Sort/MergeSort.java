package com.male.Sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 6, 3, 4};
//        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        System.out.println(Arrays.toString(a));
        mergeSort1(a, 0, a.length-1);
//        merge(a, 0, a.length - 1, (0 + a.length - 1)/2);
        System.out.println(Arrays.toString(a));
    }


    public static void mergeSort1(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort1(arr, start, mid);
            mergeSort1(arr, mid+1, end);
            merge1(arr, start, end, mid);
        }
    }

    public static void merge1(int[] arr, int start, int end, int mid){
        int[] temp = new int[arr.length];
        int p1 = start, p2 = mid + 1, key = start;

        while (p1 <= mid && p2 <= end){
            if(arr[p1] <= arr[p2]){
                temp[key++] = arr[p1++];
            }else{
                temp[key++] = arr[p2++];
            }
        }

        while (p1 <= mid)
            temp[key++] = arr[p1++];
        while (p2 <= end)
            temp[key++] = arr[p2++];

        for (int i = start; i <= end; i++)
            arr[i] = temp[i];
    }

    public static void merge(int[] arr, int start, int end, int mid){
        int[] temp = new int[arr.length];
        int p1 = start, p2 = mid + 1, key = start;
        while (p1 <= mid && p2 <= end){
            if(arr[p1] <= arr[p2]){
                temp[key++] = arr[p1++];
            }else{
                temp[key++] = arr[p2++];
            }
        }
        while (p1 <= mid)
            temp[key++] = arr[p1++];
        while (p2 <= end)
            temp[key++] = arr[p2++];

        for (int i = start; i <= end; i++){
            arr[i] = temp[i];
        }
    }
//    public static void mergeSort(int[] arr, int start, int end){
//
//        if(start < end){
//            int mid = (start + end)/2;
//            mergeSort(arr, start, mid);
//            mergeSort(arr, mid + 1, end);
//            merge(arr, start, end, mid);
//        }
//    }
}
