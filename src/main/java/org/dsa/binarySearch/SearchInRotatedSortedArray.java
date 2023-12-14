package org.dsa.binarySearch;

public class SearchInRotatedSortedArray {
    /**
     * Problem Link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/description/">...</a>
     * */
    public static int search(int[] nums, int target) {
        //intuition to use binary search run till where nums[low]<nums[high] after this run binary search
        int low =0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(target>=nums[low] || target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] || target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,8,9,10,0,1,2,3};
        System.out.println(search(nums,8));
    }

}
