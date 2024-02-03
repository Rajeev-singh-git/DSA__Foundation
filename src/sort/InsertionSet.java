package sort;

import java.util.Scanner;

public class InsertionSet {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        insertionSort(arr);

    }

    private static void insertionSort(int[] arr) {

        for(int i=1;i< arr.length;i++){

            System.out.println("Outer  loop  executed " +i+ " time");

            for(int j=i-1;j>=0;j--){
                if(isGreater(arr,j,j+1)){
                    swap(arr,j,j+1);
                }else {
                    break;
                }

            }
        }

        System.out.println("Array after Insertion Sort***********************");


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


/*Enter the size of the array
5
Enter Elements of the array
9
1
6
8
3
Outer  loop  executed 1 time
Swapping 9 at position 0 with 1 at position 1
Outer  loop  executed 2 time
Swapping 9 at position 1 with 6 at position 2
Outer  loop  executed 3 time
Swapping 9 at position 2 with 8 at position 3
Outer  loop  executed 4 time
Swapping 9 at position 3 with 3 at position 4
Swapping 8 at position 2 with 3 at position 3
Swapping 6 at position 1 with 3 at position 2
Array after Insertion Sort***********************
1 3 6 8 9

 */