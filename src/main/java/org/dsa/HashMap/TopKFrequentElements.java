package org.dsa.HashMap;

import java.util.*;

public class TopKFrequentElements {
    /**
     * problem Link <a href="https://leetcode.com/problems/top-k-frequent-elements/">...</a>
     * */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        //noinspection Java8ListSort
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
    public static int[] topKFrequentOptimal(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.merge(num,1,Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((x,y)->map.get(y)-map.get(x));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int[] result = topKFrequent(array,10);
        for(int res : result){
            System.out.print(" "+res);
        }
        result=topKFrequentOptimal(array,10);
        System.out.println();
        for(int res : result){
            System.out.print(" "+res);
        }
    }
}
