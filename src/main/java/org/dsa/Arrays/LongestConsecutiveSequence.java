package org.dsa.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /**
     * Problem Link https://leetcode.com/problems/longest-consecutive-sequence/description/
     * */
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int result = 0;
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 0;
                while(set.contains(it)){
                    count++;
                    it++;
                }
                result=Math.max(result,count);
            }

        }
        return result;
    }
    public static int longestConsecutiveUsingSort(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int previous = nums[0];
        int count = 1;
        int result =0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]==previous){
                continue;
            }
            else if(nums[i]==(previous+1)){
                previous=nums[i];
                count++;
            }
            else{
                result = Math.max(count,result);
                count=1;
                previous=nums[i];
            }
        }
        result = Math.max(count,result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(array));
        System.out.println(longestConsecutiveUsingSort(array));
    }

}
