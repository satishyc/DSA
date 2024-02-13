package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    /**
     * Problem Link <a href="https://leetcode.com/problems/majority-element-ii/description/">...</a>
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
    public static List<Integer> majorityElementOptimal2(int[] nums){
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
    public static List<Integer> majorityElementOptimal(int[] nums){
        int cnt1 =0;
        int cnt2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int num : nums){
            if(cnt1==0 && ele2!=num){
                ele1=num;
                cnt1++;
            }
            else if(cnt2==0 && ele1!=num){
                ele2=num;
                cnt2++;
            }
            else if(num==ele1) cnt1++;
            else if(num==ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num : nums){
            if(num==ele1) cnt1++;
            if(num==ele2) cnt2++;
        }
        List<Integer> result = new ArrayList<>();
        if(cnt1>=(nums.length/3)+1)
            result.add(ele1);
        if(cnt2>=(nums.length/3)+1)
            result.add(ele2);
        return result;



    }

    public static void main(String[] args) {
        List<Integer> res;
        int[] nums = new int[]{2,2,3};
        res = majorityElement(nums);
        for(int r : res){
            System.out.print(" "+r);
        }
        System.out.println();
        res = majorityElementOptimal2(nums);
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
