package sort;
import java.util.Scanner;
public class quickSort {

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
       int high  = arr.length-1;

        quickSortt(arr,low, high);
        System.out.println("Array after quick sort");

        for(int res:arr){
            System.out.print(res +" ");
        }
    }

    private static void quickSortt(int[] arr,int low, int high) {
        if(low>high){
            return;
        }

        int pivot = arr[high];
        int pi = partition(arr,pivot,low,high);
        quickSortt(arr,low,pi-1);
        quickSortt(arr,pi+1,high);
  }

    public static int partition(int [] arr, int pivot,int low,int high){

        System.out.println("Pivot -> " +pivot);

        int i=low;
        int j=low;

        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        System.out.println("Pivot index -> " +(j-1));

        System.out.println("Array after pivot ");
        for(int res:arr){
            System.out.print(res +" ");
        }

        System.out.println();

        return (j-1);

    }

    private static void swap(int[] arr, int i, int j) {

        System.out.println("Swapping " +arr[i]+ " at position " +i+ " with " +arr[j]+ " at position " +j);

        arr[i] = arr[i]+arr[j]-(arr[j]=arr[i]);

    }



}


/*
Enter the size of the array
5
Enter Elements of the array
9
3
11
18
10
Pivot -> 10
Swapping 9 at position 0 with 9 at position 0
Swapping 3 at position 1 with 3 at position 1
Swapping 10 at position 4 with 11 at position 2
Pivot index -> 2
Array after pivot
9 3 10 18 11
Pivot -> 3
Swapping 3 at position 1 with 9 at position 0
Pivot index -> 0
Array after pivot
3 9 10 18 11
Pivot -> 9
Swapping 9 at position 1 with 9 at position 1
Pivot index -> 1
Array after pivot
3 9 10 18 11
Pivot -> 11
Swapping 11 at position 4 with 18 at position 3
Pivot index -> 3
Array after pivot
3 9 10 11 18
Pivot -> 18
Swapping 18 at position 4 with 18 at position 4
Pivot index -> 4
Array after pivot
3 9 10 11 18
Array after quick sort
3 9 10 11 1
 */
