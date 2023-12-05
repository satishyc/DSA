package org.dsa;

import java.util.*;

public class MajorityElement2 {
    /**
     * Problem Link https://leetcode.com/problems/majority-element-ii/description/
     * **/
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>(n/3)){
                if(!result.contains(num)){
                    result.add(num);
                }
            }
        }
        return result;
    }
    public static List<Integer> majorityElementOptimal(int[] nums){
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int majority = n/3;
        int count = 1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                if(count>majority){
                    result.add(nums[i-1]);
                }
                count=1;
            }
        }
        if(count>majority){
            result.add(nums[n-1]);
        }


        return result;
    }

    public static void main(String[] args) {
        List<Integer> res;
        int[] nums = new int[]{1};
        res = majorityElement(nums);
        for(int r : res){
            System.out.print(" "+r);
        }
        System.out.println();
        res = majorityElementOptimal(nums);
        for(int r : res){
            System.out.print(" "+r);
        }
    }
}
