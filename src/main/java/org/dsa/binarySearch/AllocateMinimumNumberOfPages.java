package org.dsa.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllocateMinimumNumberOfPages {
    /**
     * Problem Link https://www.interviewbit.com/problems/allocate-books/
     * */

    public static int books(ArrayList<Integer> A, int B) {
        if(B>A.size())
            return -1;
        int low = Collections.max(A);
        int high = A.stream().mapToInt(Integer::intValue).sum();
        while(low<=high){
            int mid = (low+high)>>1;
            int noOfStudentsPossible = numberOfStudentsPossible(A,mid);
            if(noOfStudentsPossible>B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
    private static int numberOfStudentsPossible(ArrayList<Integer> A,int mid){
        int noOfStudents = 1;
        int sum=0;
        for(int i =0;i<A.size();i++){
            if((sum+A.get(i))<=mid){
                sum+=A.get(i);
            }
            else{
                noOfStudents++;
                sum=A.get(i);
            }
        }
        return noOfStudents;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(12,34,67,90));
        System.out.println(books(A,2));

    }
}
