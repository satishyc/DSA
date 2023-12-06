package org.dsa;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int left =0,right=col-1;
        int top =0, bottom=row-1;
        while(top<= bottom && left<=right){
            for(int i = left;i<=right;i++){
                System.out.print(" "+matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(" "+matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;--i){
                    System.out.print(" "+matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;--i){
                    System.out.print(" "+matrix[i][left]);
                }
                left++;
            }

        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

        printSpiralMatrix(matrix);
        int[][] mat = new int[][]{{1,2,3,4,5,6,7},{16,17,18,19,20,21,8},{15,14,13,12,11,10,9}};
        printSpiralMatrix(mat);
    }
}
