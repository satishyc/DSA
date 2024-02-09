package org.dsa.arrays;

public class SortColours {
    /**
     * Problem Link <a href="https://leetcode.com/problems/sort-colors/">...</a>
     * */
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            if(nums[high]==2){
                high--;
            }
            else if(nums[low]==2){
                int temp = nums[high];
                nums[high]=2;
                nums[low]=temp;
                low++;
                high--;
            }
            else{
                low++;
            }
        }
        low=0;
        while(low<=high){
            if(nums[high]==1){
                high--;
            }
            else if(nums[low]==1){
                int temp = nums[high];
                nums[high]=1;
                nums[low]=temp;
                low++;
                high--;
            }
            else{
                low++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,2,0,0,2,0,0,1,0,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(" "+num);
        }
    }
}
