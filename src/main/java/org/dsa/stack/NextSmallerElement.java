package org.dsa.stack;

import java.util.*;

public class NextSmallerElement {
    /***
     * Problem Link <a href="https://www.interviewbit.com/problems/nearest-smaller-element/">...</a>
     * */
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer integer : A) {
            while (!stack.isEmpty() && stack.peek() >= integer) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            stack.push(integer);
        }


        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> request = new ArrayList<>();
        request.add(34);
        request.add(35);
        request.add(27);
        request.add(42);
        request.add(5);
        request.add(28);
        request.add(39);
        request.add(20);
        request.add(28);
        ArrayList<Integer> result = prevSmaller(request);
        for(int val : result){
            System.out.print(" "+val);
        }


    }
}
