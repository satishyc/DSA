package org.dsa.strings;

public class ValidAnagram {
    /*
    * Problem Link https://leetcode.com/problems/valid-anagram/description/
    * */

    public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            char[] counts = new char[26];
            for(char ch : s.toCharArray()){
                counts[ch-'a']++;
            }
            for(char ch : t.toCharArray()){
                counts[ch-'a']--;
            }
            for(int i=0;i<26;i++){
                if(counts[i]!=0)
                    return false;
            }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("cat","cata"));

    }

}
