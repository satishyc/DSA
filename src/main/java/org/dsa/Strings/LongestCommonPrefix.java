package org.dsa.Strings;

public class LongestCommonPrefix {
    /**
     * * Problem Link https://leetcode.com/problems/longest-common-prefix/description/
     * */
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==1)
            return strs[0];
        String result = strs[0];
        for(int i=1;i<n;i++){
            String response = commonPrefix(result,strs[i]);
            if(response.isEmpty()){
                return "";
            }
            result=response;
        }
        return result;

    }
    private static String commonPrefix(String str1, String str2){
        int k = str1.length();
        int l = str2.length();
        StringBuilder str = new StringBuilder();
        int n = Math.min(k,l);
        for(int i=0;i<n;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                str.append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
