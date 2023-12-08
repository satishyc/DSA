package org.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    /**
     * Problem Link <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/description/">...</a>
     * */
    public static int findKthLargest(int[] nums, int k) {
        if(k> nums.length)
            return -1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            priorityQueue.add(num);
        }
        int peek = -1;
        while(k>0){
            peek = priorityQueue.peek();
            priorityQueue.remove(peek);
            --k;
        }
        return peek;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,3));
    }
}
