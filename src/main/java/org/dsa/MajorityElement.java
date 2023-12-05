package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /**
     * Problem Link https://www.codingninjas.com/studio/problems/majority-element_6783241
     * **/
    public static int majorityElement(int []values) {
        // Write your code here
        int n =values.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int v : values){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=(n/2)){
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] values = new int[]{58,58,28,95,95,15,58,58,98};
        System.out.println(majorityElement(values));
    }
}
