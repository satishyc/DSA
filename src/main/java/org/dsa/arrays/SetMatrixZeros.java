package org.dsa.arrays;

public class SetMatrixZeros {
    /**
     * Problem Link <a href="https://leetcode.com/problems/set-matrix-zeroes/">...</a>
     * */
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowCount = new int[row];
        int[] colCount = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rowCount[i]=1;
                    colCount[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            if(rowCount[i]==1){
                for(int j=0;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<col;i++){
            if(colCount[i]==1){
                for(int j=0;j<row;j++){
                    matrix[j][i]=0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,2,0},{3,0,5,2},{1,3,1,5}};
        for(int[] mat : matrix){
            for(int m : mat){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        System.out.println(); System.out.println();
        setZeroes(matrix);
        for(int[] mat : matrix){
            for(int m : mat){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }

}
