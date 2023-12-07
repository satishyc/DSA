package org.dsa.HashMap;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class TopKFrequentElements {
    /**
     * problem Link https://leetcode.com/problems/top-k-frequent-elements/
     * */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList,Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int i=0;
        int[] result = new int[k];

        for(Map.Entry<Integer,Integer> entry : entryList){
            if(i==k)
                break;
            result[i]=entry.getKey();
            i++;
        }


        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int[] result = topKFrequent(array,10);
        for(int res : result){
            System.out.print(" "+res);
        }
    }
}
