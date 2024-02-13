package org.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Problem Link <a href="https://leetcode.com/problems/majority-element/">...</a>
     * **/
    public static int majorityElement(int []values) {
        // Write your code here
        int n =values.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int v : values){
            map.put(v,map.getOrDefault(v,0)+1);
            if(map.get(v)>(n/2)){
                return v;
            }
        }
        return -1;

    }
    public static int majorityElement2(int[] values){
        int count = 0;
        int element = Integer.MIN_VALUE;
        for(int val : values){
            if(count==0){
                count++;
                element=val;
            }
            else if(element==val){
                count++;
            }
            else{
                count--;
            }
        }
        int count2=0;
        for(int val : values){
            if(val==element)
                count2++;
        }
        if(count2>(values.length/2))
            return element;
        return -1;

    }

    public static void main(String[] args) {
        int[] values = new int[]{1,2,2,2,1,1,1,2,2,1};
        System.out.println(majorityElement(values));
        System.out.println(majorityElement2(values));
    }
}
