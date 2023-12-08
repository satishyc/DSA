package org.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    /**
     * Problem link <a href="https://leetcode.com/problems/count-and-say/description/">...</a>
     * */
    public static String countAndSay(int n) {
        List<List<String>> chars = new ArrayList<>(n);
        List<String> list = new ArrayList<>();
        list.add("1");
        chars.add(list);
        for(int i=1;i<n;i++){
            chars.add(generateSequence(chars.get(i-1)));
        }
        List<String> response = chars.get(n-1);
        StringBuilder str = new StringBuilder();
        for(String ch : response){
            str.append(ch);
        }
        return str.toString();
    }
    private static List<String> generateSequence(List<String> previousList){
        List<String> result = new ArrayList<>();
        String previous = previousList.get(0);
        int count = 1;
        for(int i=1;i< previousList.size();i++){
            String current = previousList.get(i);
            if(!current.equals(previous)){
                result.add(String.valueOf(count));
                result.add(previous);
                previous=current;
                count=1;
            }
            else{
                count++;
            }
        }
        result.add(String.valueOf(count));
        result.add(previous);

        return result;

    }
    public static String countAndSayOptimal(int n){
        StringBuilder str = new StringBuilder();
        str.append('1');
        for(int i=1;i<n;i++){
            str = genrate(str);
        }
        return str.toString();
    }
    private static StringBuilder genrate(StringBuilder str){
        StringBuilder result = new StringBuilder();
        char previous = str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            if(previous!=current){
                result.append(count);
                result.append(previous);
                previous=current;
                count=1;
            }
            else{
                count++;
            }
        }
        result.append(count);
        result.append(previous);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1).equals(countAndSayOptimal(1)));
        System.out.println(countAndSay(2).equals(countAndSayOptimal(2)));
        System.out.println(countAndSay(3).equals(countAndSayOptimal(3)));
        System.out.println(countAndSay(4).equals(countAndSayOptimal(4)));
        System.out.println(countAndSay(5).equals(countAndSayOptimal(5)));
        System.out.println(countAndSay(6).equals(countAndSayOptimal(6)));
        System.out.println(countAndSay(7).equals(countAndSayOptimal(7)));
        System.out.println(countAndSay(8).equals(countAndSayOptimal(8)));


    }
}
