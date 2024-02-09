package org.dsa.arrays;



public class RotateImage {
    /**
     * Problem Link <a href="https://leetcode.com/problems/rotate-image/">...</a>
     * */
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose Matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Reverse Matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
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

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] result = rotateWithExtraSpace(matrix);
        rotate(matrix);
        int n =matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(result[i][j]!=matrix[i][j]){
                    System.out.println("["+i+"]["+j+"] this position is not matching");
                }

            }
        }

    }
}
