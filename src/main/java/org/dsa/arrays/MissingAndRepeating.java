package org.dsa.arrays;

import java.util.ArrayList;

public class MissingAndRepeating {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] pos = new int[n];
        int[] result = new int[2];
        for(int i=0;i<n;i++){
            if(pos[arr.get(i)-1]==1){
                result[1]=arr.get(i);
            }
            else{
                pos[arr.get(i)-1]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(pos[i]==0){
                result[0]=i+1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);arr.add(2);arr.add(1);arr.add(4);arr.add(3);
        int[] result = missingAndRepeating(arr,arr.size());
        System.out.println(result[0]+" "+result[1]);
    }
}
