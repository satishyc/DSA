package org.dsa.strings;

public class RepeatedStringMatch {
    /**
     * Problem Link https://leetcode.com/problems/repeated-string-match/
     * */
    public static int repeatedStringMatch(String a, String b) {
        int n = b.length();
        int k = 0;
        String res= "";
        while(res.length()<=n){
            res+=a;
            k++;
        }
        if(res.contains(b))
            return k;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd","cdabcdab"));
    }
}
