package org.dsa.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreatestElement {
    /**
     * Problem Link <a href="https://leetcode.com/problems/next-greater-element-i/description/">...</a>
     * */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        int[] result = new int[nums1.length];
        int[] nextGreatest = new int[n];
        for(int i= n-1;i>=0;--i){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreatest[i]=-1;
            }
            else{
                nextGreatest[i]=stack.peek();
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            map.put(nums2[i],nextGreatest[i]);
        }
        for(int i=0;i< result.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,2,3,4};
        int[] results = nextGreaterElement(nums1,nums2);
        for(int result : results){
            System.out.print(" "+result);
        }
    }
}
