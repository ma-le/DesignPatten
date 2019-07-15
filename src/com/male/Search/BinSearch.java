package com.male.Search;


public class BinSearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9};
        System.out.println(binsearch(arr, 99, 0, arr.length - 1));
    }
    public static int binsearch(int[] arr, int key, int low, int high){
        int mid = (low + high)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(low >= high){
            return -1;
        }
        if (arr[mid] > key){
            return binsearch(arr, key, low, mid - 1);
        }else{
            return binsearch(arr, key, mid + 1, high);
        }
    }







//    int mid = (low + high)/2;
//        if(arr[mid] == key){
//        return mid;
//    }
//        if(low >= high){
//        return  -1;
//    }else if(key < arr[mid]){
//        return binsearch(arr, key, low, mid - 1);
//    }else{
//        return binsearch(arr, key, mid + 1, high);
//    }
}
