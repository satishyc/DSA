package org.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    /**
     * Problem Link https://leetcode.com/problems/merge-intervals/
     * */
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] pairs) -> pairs[0]).
                thenComparingInt(pair->pair[1]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int n = intervals.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=start && intervals[i][0]<=end){
                end=intervals[i][1];
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                result.add(list);
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);
        result.add(list);
        int[][] results = new int[result.size()][2];
        for(int i=0;i< result.size();i++){
            results[i][0]=result.get(i).get(0);
            results[i][1]=result.get(i).get(1);

        }
        return results;
    }


    public static void main(String[] args) {
        int[][] intervals = new int[][]{{2,6},{8,10},{15,18},{2,4},{3,9},{1,3}};
        int[][] result = merge(intervals);
        for(int[] res : result){
            System.out.println(" "+res[0]+" "+res[1]);
        }



    }
}
