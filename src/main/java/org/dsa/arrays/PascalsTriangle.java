package org.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
    /**
     * Problem Link <a href="https://leetcode.com/problems/pascals-triangle/">..</a>
     * */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    list.add(1);
                }
                else{
                    list.add(result.get(i-2).get(j-1)+result.get(i-2).get(j-2));
                }
            }
            result.add(list);
        }


        return result;

    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(7);
        for(List<Integer> list : result){
            for(Integer val : list){
                System.out.print(" "+val);
            }
            System.out.println();
        }
    }


}
