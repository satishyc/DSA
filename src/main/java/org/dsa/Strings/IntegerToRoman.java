package org.dsa.Strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerToRoman {
    private static final String[] ONES = {"I","X","C","M"};
    private static final String[] FIVES = {"V","L","D"};
    public static String intToRoman(int num){
        if(num<=0 || num>=3999){
            return null;
        }
        String result = "";
        int position = 0;
        while(num>0){
            if(num%10 !=0){
                result=getRoman(num%10,position)+result;
            }
            num=num/10;
            position++;

        }
        return result;
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

    @Test
    public static void main(String[] args) {

        Assert.assertEquals(intToRoman(3),"III");
        Assert.assertEquals(intToRoman(300),"CCC");
        Assert.assertEquals(intToRoman(4003),null);
        Assert.assertEquals(intToRoman(123),"CXXIII");
        Assert.assertEquals(intToRoman(896),"DCCCXLVI");



    }
}
