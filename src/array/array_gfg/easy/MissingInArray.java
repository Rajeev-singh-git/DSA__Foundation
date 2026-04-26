package array.array_gfg.easy;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = scn.nextInt();
        int[] arr = new int[n-1];


        System.out.println("Enter value of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

      int mn =  missingElementInArray(arr,arr.length);


      System.out.println("Missing element in Array is " +mn);
    }

    private static int missingElementInArray(int [] arr, int n) {

        int i = 0;
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // find missing
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return n + 1;
    }
}
