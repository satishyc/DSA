package org.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static void main(String[] args) {
        List<Integer> res;
        int[] nums = new int[]{1,2,1,2,1,1,1};
        res = majorityElement(nums);
        for(int r : res){
            System.out.print(" "+r);
        }
    }
}
