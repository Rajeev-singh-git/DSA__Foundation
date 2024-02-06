package sort;

import java.util.Scanner;
public class quickSelect {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter which smallest number you want ...");
        int k = scn.nextInt();

        // If array would had been sorted, K^th smallest would be at k-1 index.
        int idx = k-1;
        int low = 0;
        int high  = arr.length-1;

       int res =  quickSelectt(arr,idx,low, high);


        System.out.println(k+ " smallest is " +res);

    }


    private static int quickSelectt(int[] arr, int k, int low, int high) {

        int pivot = arr[high];
        int pi = partition(arr, low, high, pivot);

        if (k > pi) {
            return quickSelectt(arr, k, pi + 1, high);
        } else if (k < pi) {
            return quickSelectt(arr, k, low, pi - 1);
        } else {
            return arr[pi];
        }
    }

    private static int partition(int[] arr, int low, int high, int pivot) {

        int i = low;
        int j = low;


        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        System.out.println("Pivot is "+arr[j-1]);
        return (j-1);

    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i]+arr[j]-(arr[j]=arr[i]);
    }
}


/*
Enter the size of the array
5
Enter Elements of the array
33
55
11
77
44
Enter which smallest number you want ...
4
Pivot is 44
Pivot is 55
4 smallest is 55
 */