package sort;

import java.util.Scanner;

public class radixSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        RadixSort(arr);
        System.out.println("Array after Radix Sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void RadixSort(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>max){
                max=num;
            }
        }

        int exp = 1;
        // Perform radix sort
        while(exp<=max){
            CountSort(arr,exp);
            exp = exp*10;
        }
    }

    private static void CountSort(int[] arr, int exp) {

        int [] freqArr = new int[10];

        // Count the frequency of digits at each position
        for(int i=0;i<arr.length;i++){
            freqArr[arr[i]/exp%10]++;    /* not subtracting min in index because frequency ranges from 0 to 9. 0 subtracted by anything, no change.
                                           dividing and multiplying by exp because we are sorting based on digit */
        }

       // convert it into prefix sum array
        for(int i=1;i<freqArr.length;i++){
            freqArr[i] += freqArr[i-1];
        }
       // converting it into prefix sum array
        int [] ans = new int [arr.length];
        //stable sorting(Filling ans array)
        for (int i=arr.length-1; i>=0;i--){
            int pos = freqArr[arr[i]/exp%10]-1;
            ans[pos] = arr[i];
            freqArr[arr[i]/exp%10]--;
        }
        //filling original array with the help of ans array

        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
}


/*
Enter the size of the array
6
Enter Elements of the array
861
653
116
342
110
761
Array after Radix Sort
110 116 342 653 761 861
 */