package org.dsa.arrays;

public class MaximumSubArray {
    /**
     * Problem Link <a href="https://leetcode.com/problems/maximum-subarray/">....</a>
     * */
    public static int maxSubArray(int[] nums) {
          int maxSum = Integer.MIN_VALUE;
          int currentSum = 0;
          for(int num : nums){
                currentSum+=num;
                maxSum=currentSum>maxSum?currentSum:maxSum;
                if(currentSum<0)
                    currentSum=0;
          }
          return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

}
