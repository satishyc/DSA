package org.dsa.binarySearch;

public class SingleElementInSortedArray {
    /**
     * Problem Link <a href="https://leetcode.com/problems/single-element-in-a-sorted-array/description/">...</a>
     * */
    public static int singleNonDuplicate(int[] nums) {
        int low =0 ;
        int high = nums.length-1;
        while(low<=high){
            if(low==high){
                return nums[low];
            }
            else if(nums[low]!=nums[low+1]){
                return nums[low];
            }
            else if(nums[high]!=nums[high-1]){
                return nums[high];
            }
            low+=2;
            high-=2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,2,2,4,4,8,8,9,9};
        System.out.println(singleNonDuplicate(nums));
    }
}
