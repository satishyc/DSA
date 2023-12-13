package org.dsa.strings;

import java.math.BigInteger;

public class CompareVersionNumbers {
    /**
     * Problem Link <a href="https://leetcode.com/problems/compare-version-numbers/">...</a>
     * */
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int c1 = v1.length;
        int c2 = v2.length;
        int n = Math.min(c1,c2);
        for(int i=0;i<n;i++){
            long val1 = Long.valueOf(v1[i]);
            long val2 = Long.valueOf(v2[i]);
            if(val1!=val2){
                return val1<val2?-1:1;
            }
        }
        long count = 0;
        if(c1>c2){
            for(int i = n;i<c1;i++){
                count+=Long.valueOf(v1[i]);
            }
            if(count==0)
                return 0;
            return 1;
        }
        else{
            for(int i=n;i<c2;i++){
                count+=Long.valueOf(v2[i]);
            }
            if(count==0)
                return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("7.5.2.4","7.5.3"));
    }
}
