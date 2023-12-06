package org.dsa.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Problem Link https://leetcode.com/problems/majority-element/
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

    public static void main(String[] args) {
        int[] values = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(values));
    }
}
