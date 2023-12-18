package org.dsa.binarySearch;

import java.util.Collections;
import java.util.PriorityQueue;

public class MatrixMedian {
    /**
     * Problem Link <a href="https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473">...</a>
     * */
    public static int findMedian(int[][] matrix, int m, int n) {
        int low = 1;
        int high = 1000000000;
        int row = m;
        int col=n;
        while(low<=high){
            int mid = (low+high)/2;
            int count = 0;
            for(int[] mat : matrix){
                count+=countSmallerThanMid(mat,mid,col);
            }
            if(count<=(row*col)/2){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }




        return low;

    }
    private static int countSmallerThanMid(int[] arr,int mid,int col){
        int low = 0;
        int high = col-1;
        while(low<=high){
            int md = (low+high)>>1;
            if(arr[md]<=mid){
                low=md+1;
            }
            else{
                high=md-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int m = 5, n= 5;
        int[][] matrix = new int[][]{{1,5,7,9,11},{2,3,4,8,9},{4,11,14,19,20},{6,10,22,99,100},{7,15,17,24,28}};
        System.out.println(findMedian(matrix,m,n));

    }
}
