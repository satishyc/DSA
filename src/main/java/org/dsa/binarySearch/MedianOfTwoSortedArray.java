package org.dsa.binarySearch;

public class MedianOfTwoSortedArray {
    /**
     * Problem Link https://leetcode.com/problems/median-of-two-sorted-arrays/
     * */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length;
        int l = nums2.length;
        int n = k+l;
        int first = n/2;
        int second = first-1;
        int count = 0;
        int i=0,j=0;
        double n1=0.0,n2=0.0;
        while(i<k && j<l){
            if(nums1[k-1-i] > nums2[l-1-j]){
                if(count==first) n1=nums1[k-1-i];
                if(count==second) n2=nums1[k-1-i];
                i++;
            }
            else{
                if(count==first) n1=nums2[l-1-j];
                if(count==second) n2=nums2[l-1-j];
                j++;
            }
            if(n1!=0.0 && n2!=0.0)
                return n%2==1?n1:(n1+n2)/2;

            count++;
        }
        while(i<k){
            if(count==first) n1=nums1[k-1-i];
            if(count==second) n2=nums1[k-1-i];
            i++;
            if(n1!=0.0 && n2!=0.0)
                return n%2==1?n1:(n1+n2)/2;

            count++;
        }
        while(j<l){
                if(count==first) n1=nums2[l-1-j];
                if(count==second) n2=nums2[l-1-j];
            j++;
            if(n1!=0.0 && n2!=0.0)
                return n%2==1?n1:(n1+n2)/2;

            count++;
        }

        return n%2==1?n1:(n1+n2)/2;

    }

    public static void main(String[] args) {
            int[] nums1 = new int[]{4,4,5,6};
            int[] nums2 = new int[]{1,2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
