package org.dsa.arrays;

import java.util.Arrays;

public class NextPermutation {
    /**
     * Problem Link <a href="https://leetcode.com/problems/next-permutation/">...</a>
     * */
    public static void nextPermutation(int[] nums) {
        int pos =0;
        for(int i=nums.length-2;i>=0;--i){
            if(nums[i]<nums[i+1]){
                pos=i+1;
                int swapPos=-1;
                int max = Integer.MAX_VALUE;
                for(int j=i+1;j< nums.length;j++){
                    if((nums[j]>nums[i]) && nums[j]<max){
                        max=nums[j];
                        swapPos=j;
                    }
                }
                int temp = nums[i];
                nums[i]=nums[swapPos];
                nums[swapPos]=temp;
                break;
            }

        }
        if(pos==0){
            Arrays.sort(nums);
        }
        else{
            Arrays.sort(nums,pos,nums.length);
        }



    }

    public static void main(String[] args) {
        //2,1,5,4,3,0,0
        // 2 3 0 0 1 4 5
        int [] nums = new int[]{2 ,3 ,0 ,0 ,4,5 ,1};
        nextPermutation(nums);
        for(int num : nums){
            System.out.print(" "+num);
        }

    }
}
