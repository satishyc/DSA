package org.dsa.Stack;

import java.util.Stack;

public class ValidParentheses {
    /**
     * Problem link <a href="https://leetcode.com/problems/valid-parentheses">...</a>
     * */
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stk.add(ch);
            }
            else if(ch=='}' || ch==']' || ch==')'){
                if(stk.isEmpty()){
                    return false;
                }
                else{
                    char top = stk.pop();
                    if(!((top == '{' && ch =='}')||(top == '[' && ch ==']')||top == '(' && ch ==')')){
                        return false;
                    }
                }

            }
            else{
                System.out.println("Input type is wrong "+ch+" this character is not allowed");
                return false;
            }
        }
        return stk.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        String s = "{}()";
        System.out.println(isValid(s));
    }

}
