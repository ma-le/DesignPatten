package com.male.Search;


public class BinSearch2 {


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9};
        System.out.println(binsearch(arr,  -2));
    }
    public static int binsearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        if(arr[low] > key || arr[high] < key){
            return -1;
        }
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }










//    int low = 0;
//    int high = arr.length - 1;
//
//        if(key > arr[high] || key < arr[low]){
//        return -1;
//    }
//        while(low <= high){
//        int mid = (low + high)/2;
//        if(arr[mid] < key){
//            low = mid + 1;
//        }else if(arr[mid] > key){
//            high = mid - 1;
//        }else{
//            return mid;
//        }
//    }
//        return -1;
}
