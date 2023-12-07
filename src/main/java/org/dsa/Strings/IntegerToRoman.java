package org.dsa.Strings;


import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerToRoman {
    private static final String[] ONES = {"I","X","C","M"};
    private static final String[] FIVES = {"V","L","D"};
    public static String intToRoman(int num){
        if(num<=0 || num>=3999){
            return null;
        }
        StringBuilder result = new StringBuilder();
        int position = 0;
        while(num>0){
            if(num%10 !=0){
                result.insert(0, getRoman(num % 10, position));
            }
            num=num/10;
            position++;

        }
        return result.toString();
    }
    public static String getRoman(int val,int position){
        if(val>=1 && val<=3){
            return getRepetedString(val,ONES[position]);
        }
        else if(val==4){
            return ONES[position]+FIVES[position];
        }
        else if(val==5){
            return FIVES[position];
        }
        else if(val>=6 && val<=8) {
            return FIVES[position] + getRepetedString(val - 5, ONES[position]);
        }
        else if(val==9){
            return ONES[position]+FIVES[position];
        }
        return null;
    }
    private static String getRepetedString(int count, String ch){
        return IntStream.range(0, count)
                .mapToObj(i -> ch)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {

         System.out.println(Objects.requireNonNull(intToRoman(3)).equals("III"));
         System.out.println(Objects.requireNonNull(intToRoman(300)).equals("CCC"));
         System.out.println(intToRoman(4003)==null);
         System.out.println(Objects.requireNonNull(intToRoman(123)).equals("CXXIII"));
         System.out.println(Objects.requireNonNull(intToRoman(896)).equals("DCCCXLVI"));

    }
}
