package com.male.Sort;

public class BubbleSort {

    /**
     * 冒泡   从左往右  和   从右往左
     */

    public static void main(String[] args) {

        int[] a = {9,9,6,5,4,1,4,7,4,8,5,4,5,3,1,4,8};
        bubble(a);
        for (int aa : a){
            System.out.print(aa);
            System.out.print(",");
        }
    }

    public static void bubble(int [] nums){
        int temp = 0;
        int size = nums.length;

//        for(int i = 0; i < size - 1; i++){
//            for(int j = 0; j < size - 1 - i; j++){
//                if(nums[j] > nums[j+1]){
//                    temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }

        for(int i = size - 1; i > 0; i--){
            for(int j = size - 1; j > size - i - 1; j--){
                if(nums[j] < nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
