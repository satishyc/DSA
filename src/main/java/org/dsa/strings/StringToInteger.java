package org.dsa.strings;

public class StringToInteger {
    /**
     * Problem Link https://leetcode.com/problems/string-to-integer-atoi/description/
     * */
    public static int myAtoi(String s) {
        String[] str = s.trim().split(" ");
        for(String st : str){
            st=st.trim();
            try{
                Integer.valueOf(st);
                long num = Long.valueOf(st);
                return clampTo32BitSignedRange(num);
            }
            catch (NumberFormatException ex){

            }

        }

        return -1;
    }
    public static int clampTo32BitSignedRange(long num) {
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        return (int) Math.max(minVal, Math.min(num, maxVal));
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-4193894555 with words    "));
        long inputInteger = -4193894555l;  // Replace this with your integer
        int clampedInteger = clampTo32BitSignedRange(inputInteger);

        System.out.println("Original integer: " + inputInteger);
        System.out.println("Clamped integer: " + clampedInteger);
    }

}
