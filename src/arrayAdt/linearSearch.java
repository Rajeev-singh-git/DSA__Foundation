package arrayAdt;

import java.util.Scanner;
public class linearSearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter key you want to search");
        int key = scn.nextInt();
        System.out.println("Key found at index " + linearSearchM(arr, key) + " using Linear Search");
        System.out.println("1st time Key found at index " + transpositionLinearSearch(arr, key) + " using improved (Transposition) Linear Search");
        System.out.println("All elements according to their index");
        printElement(arr);
        System.out.println("2nd time Key found at index " + transpositionLinearSearch(arr, key) + " using improved (Transposition) Linear Search");
        System.out.println("All elements according to their index");
        printElement(arr);
        System.out.println("1st time Key found at index " + headLinearSearch(arr, key) + " using improved (head) Linear Search");
        System.out.println("All elements according to their index");
        printElement(arr);
    }

    public static int linearSearchM(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i])
                return i;
        }
        return -1;
    }

    public static int transpositionLinearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                swap(arr, i, i-1);
                return i-1;
            }
        }
        return -1;

    }

    private static int headLinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                swap(arr, i, 0);
                return 0;
            }
        }
        return -1;
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void printElement(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
