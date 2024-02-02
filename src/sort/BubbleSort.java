package sort;

import java.util.Scanner;

public class BubbleSort {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        bubbleSort(arr);


    }

    public static  void bubbleSort(int [] arr){


        for(int i=1;i<arr.length;i++){

         //   System.out.println("Outer  loop  executed " +i+ " time");

            for(int j=0;j<arr.length-i; j++){
                if(isGreater(arr,j,j+1)){
                    swap(arr,j,j+1);
                }
            }
        }

        System.out.println("Array after Bubble Sort");

        for(int num: arr){
            System.out.print(num+ " ");
        }




    }

    private static void swap(int[] arr, int j, int i) {

        System.out.println("Swapping " +arr[j]+ " at position " +j+ " with " +arr[i]+ " at position " +i);

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static boolean isGreater(int[] arr, int j, int i) {

        if(arr[j]>arr[i]){
            return true;
        }
        return false;
    }
}
