package array.array_gfg.medium;

import java.util.Scanner;

/*Given an array A[] of N positive integers.
The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.

Input:
N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6

 */

public class maximumIndex {

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

     calculateMaximumIndex(arr,n); //Time Limit Exceeded in GFG for many cases

    }

    private static void calculateMaximumIndex(int[] arr, int n) {

        int maxDiff = -1;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(arr[j]>=arr[i] && maxDiff < (j-i) )
                    maxDiff = j-i;
            }
        }

        System.out.println(maxDiff);
    }

}



