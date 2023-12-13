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
            if(nums[low]<nums[high]){
                mid=(low+high)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(nums[low]==target){
                    return low;
                }
                else if(nums[high]==target){
                    return high;
                }
                low++;
                high--;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,8,9,10,0,1,2,3};
        System.out.println(search(nums,8));
    }

}
