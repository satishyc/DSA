package org.dsa.arrays;

import java.util.Arrays;

/**
 * Problem Link <a href="https://leetcode.com/problems/unique-paths/description/"></a>
 * */
public class GridUniquePaths {
    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return recursive(dp,m,n,0,0);

    }
    private static int  recursive(int dp[][],int m,int n,int x,int y){
            if(x==m-1 && y==n-1) return 1;
            else if(x>=m || y>=n) return 0;
            if(dp[x][y]!=-1) return dp[x][y];
            else return dp[x][y]=recursive(dp,m,n,x+1,y)+recursive(dp,m,n,x,y+1);

    }

    public static void main(String[] args) {
        int m=5,n=10;

        System.out.println(uniquePaths(m,n));
        System.out.println(optimal(m,n));
    }
    public static int optimal(int m,int n){
        int N=m+n-2;
        int r=n-1;
        double res = 1.0;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }


}
