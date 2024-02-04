package sort;

import java.util.Scanner;

public class mergeSort {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int low = 0;
        int high = arr.length-1;

        int [] res  = MergeSort(arr,low,high);

        System.out.println("Array after Sort");

        for(int num:res)
            System.out.print(num + " ");

    }

    private static int[] MergeSort(int[] arr, int low, int high) {
        
        if(low == high){
            int [] ba = new int[1];
            ba[0] = arr[low];
            return ba;
        }


        int mid = (low+high)/2;

        int [] fsh = MergeSort(arr,low,mid);
        int [] ssh = MergeSort(arr,mid+1,high);
        int [] fsa = mergeArray(fsh,ssh,fsh.length,ssh.length);

        return fsa;
    }

    private static int [] mergeArray(int[] arr1, int[] arr2, int n, int m) {

        int [] res = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }else{
                res[k]=arr2[j];
                j++;
                k++;
            }

        }

        while(i<n){
            res[k]=arr1[i];
            i++;
            k++;
        }

        while (j<m){
            res[k]=arr2[j];
            j++;
            k++;
        }

        return res;
    }



}
