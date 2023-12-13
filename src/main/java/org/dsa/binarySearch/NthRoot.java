package org.dsa.binarySearch;

public class NthRoot {
    /**
     * Problem Link https://www.codingninjas.com/studio/problems/1062679
     * */
    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            int pow = (int)Math.pow(mid,n);
            if(pow==m)
                return mid;
            else if(pow>m)
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(3,27));
        System.out.println(NthRoot(5,64));
        System.out.println(NthRoot(4,69));


    }
}
