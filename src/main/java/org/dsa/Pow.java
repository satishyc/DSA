package org.dsa;

public class Pow {
    /**
     * Problem Link https://leetcode.com/problems/powx-n/description/
     * **/
    public static double myPow(double x, int n) {
        double result = 1.0;
        //assign power to long to avoid overflow
        long nn = n;
        if(nn<0) nn=-1*n;
        while(nn>0){
            if(nn%2==0){
                x*=x;
                n/=2;
            }
            else{
                result*=x;
                n-=1;
            }
        }
        if(n<0) return  (1/result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,-2147483648));
    }
}
