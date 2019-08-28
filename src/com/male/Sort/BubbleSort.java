package com.male.Sort;

import java.util.Arrays;

public class BubbleSort {

    private InsertSort insertSort;

    public InsertSort getInsertSort() {
        return insertSort;
    }

    public void setInsertSort(InsertSort insertSort){
        this.insertSort = insertSort;
    }
    /**
     * 冒泡   从左往右  和   从右往左
     */

    public static void main(String[] args) {

        int[] a = {6,2,1,4,8,9,7,3,5};
        System.out.println(Arrays.toString(a));
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubble(int [] nums){




        for(int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }


        for (int i = nums.length - 1; i > 0; i--){
            for (int j = nums.length - 1; j > nums.length - 1 - i; j--){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }












//        for(int i = 0; i < size - 1; i++){
//            for(int j = 0; j < size - 1 - i; j++){
//                if(nums[j] > nums[j+1]){
//                    temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }

//        for(int i = size - 1; i > 0; i--){
//            for(int j = size - 1; j > size - i - 1; j--){
//                if(nums[j] < nums[j-1]){
//                    temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }
    }
}
