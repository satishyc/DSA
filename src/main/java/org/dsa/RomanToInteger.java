package org.dsa;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum =0 ;
        int n = s.length();
        int previous = 0;
        for(int i = n-1; i>=0;--i){
            char ch = s.charAt(i);
            int current = getRoman(ch);
            if(current < previous){
                sum-=current;
            }
            else{
                sum+=current;
            }
            previous=current;
        }
        return sum;
    }

    private static int getRoman(char ch){
        int num = 0;
        switch(ch){
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;

        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("VI"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XL"));
        System.out.println(romanToInt("LX"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
