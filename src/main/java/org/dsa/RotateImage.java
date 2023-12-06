package org.dsa;

import org.junit.Assert;
import org.junit.Test;

public class RotateImage {
    /**
     * Problem Link https://leetcode.com/problems/rotate-image/
     * */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose the matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Reverse the matrix
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }
    public static int[][]  rotateWithExtraSpace(int[][] matrix){
        if(matrix.length!=matrix[0].length){
            return null;
        }
        int n = matrix.length;
        int [][] result = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][j]=matrix[n-1-j][i];
            }
        }


        return result;
    }

    @Test
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] result = rotateWithExtraSpace(matrix);
        rotate(matrix);
        int n =matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Assert.assertEquals(result[i][j],matrix[i][j]);
            }
        }

    }
}
