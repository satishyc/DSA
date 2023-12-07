package org.dsa.Math;

public class Pow {
    /**
     * Problem Link <a href="https://leetcode.com/problems/powx-n/description/">...</a>
     * **/
    public static double myPow(double x, int n) {
        double result = 1.0;
        long nn = n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==0){
                x*=x;
                nn/=2;
            }
            else{
                result*=x;
                nn-=1;
            }
        }
        if(n<0) return  (1/result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,-2147483648));
    }
}
