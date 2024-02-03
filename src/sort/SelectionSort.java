package sort;

import java.util.Scanner;

public class SelectionSort {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        selectionSort(arr);

    }

    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            System.out.println("Outer  loop  executed " +(i+1)+ " time");
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)){
                    min = j;
                }
            }
            swap(arr,i,min);
        }

        System.out.println("Array after Selection Sort");

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

    private static boolean isSmaller(int[] arr, int j, int i) {

        return arr[j] < arr[i];
    }
}

/*
Enter the size of the array
5
Enter Elements of the array
5
9
8
1
2
Outer  loop  executed 1 time
Swapping 5 at position 0 with 1 at position 3
Outer  loop  executed 2 time
Swapping 9 at position 1 with 2 at position 4
Outer  loop  executed 3 time
Swapping 8 at position 2 with 5 at position 3
Outer  loop  executed 4 time
Swapping 8 at position 3 with 8 at position 3
Array after Selection Sort
1 2 5 8 9
 */