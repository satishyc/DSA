package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class NextGreatestElement {
    /*
    * Problem Link https://leetcode.com/problems/next-greater-element-i/description/
    * */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums2.length;
        for(int i=0;i<n;i++){
            map.put(nums2[i],-1);
            for(int j=i+1;j<n;j++){
                if(nums2[i]<nums2[j]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }

            }

        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] result = nextGreaterElement(nums1,nums2);
        for(int res : result){
            System.out.print(" "+res);
        }
    }
}
