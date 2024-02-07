package sort;

import java.util.Scanner;

public class countSort {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }else if(max<arr[i]){
                max = arr[i];
            }
        }

        CountSort(arr,min,max);

    }

    private static void CountSort(int[] arr, int min, int max) {

        int range = (max-min)+1;

        int [] freqArr = new int[range];

//        for(int i=0;i<arr.length;i++){  // same code using for each loop
//            int idx = arr[i]-min;
//            freqArr[idx]++;
//        }


        for (int j : arr) {
            int idx = j - min;
            freqArr[idx]++;
        }

        for(int i=1;i<freqArr.length;i++){
            freqArr[i] = freqArr[i]+freqArr[i-1];
        }

        int [] ans = new int [arr.length];

        for (int i=arr.length-1; i>=0;i--){
            int val = arr[i];
            int pos = freqArr[val-min];
            int idx = pos-1;
            ans[idx] = val;
            freqArr[val-min]--;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }


        System.out.println("Array after Count Sort");

        for(int num:arr){
            System.out.print(num +" ");
        }

    }

}

/*
Enter the size of the array
15
Enter Elements of the array
9
6
3
5
3
4
3
9
6
4
6
5
8
9
9
Array after Count Sort
3 3 3 4 4 5 5 6 6 6 8 9 9 9 9
 */