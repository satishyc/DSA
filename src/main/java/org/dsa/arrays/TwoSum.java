package org.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Problem Link <a href="https://leetcode.com/problems/two-sum/description/">...</a>
     * */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int recp = target-nums[i];
            if(map.containsKey(recp)){
                return new int[]{map.get(recp),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] result = twoSum(nums,9);
        System.out.println(" "+result[0]+" "+result[1]);
        result = twoSum(nums,18);
        System.out.println(" "+result[0]+" "+result[1]);
        result = twoSum(nums,25);
        System.out.println(" "+result[0]+" "+result[1]);
    }

}
