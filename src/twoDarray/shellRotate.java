package twoDarray;

import java.util.Scanner;

public class shellRotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        int s = scn.nextInt();
        int r = scn.nextInt();

        rotateShell(arr, s, r);
        display(arr);
    }

    private static void rotateShell(int[][] arr, int s, int r) {
        int[] oneD = fillOneDfromShell(arr, s);
        rotate(oneD, r);
        fillShellFromOneD(arr, oneD, s);
    }

    private static void fillShellFromOneD(int[][] arr, int[] oneD, int s) {
        int minR = s - 1;
        int minC = s - 1;
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;

        int idx = 0;

        for (int i = minR, j = minC; i <= maxR; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = maxR, j = minC + 1; j <= maxC; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = maxR - 1, j = maxC; i >= minR; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = minR, j = maxC - 1; j >= minC + 1; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }


    }

    private static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if (r < 0) {
            r += oneD.length;
        }

        reverse(oneD, 0, oneD.length - r - 1);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);

    }

    private static void reverse(int[] oneD, int li, int ri) {

        while (li < ri) {
            int temp = oneD[li];
            oneD[li] = oneD[ri];
            oneD[ri] = temp;
            li++;
            ri--;
        }

    }

    private static int[] fillOneDfromShell(int[][] arr, int s) {
        int minR = s - 1;
        int minC = s - 1;
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;
        int sz = 2 * (maxR - minR + maxC - minC);

        int[] oneDArray = new int[sz];
        int idx = 0;

        for (int i = minR, j = minC; i <= maxR; i++) {
            oneDArray[idx] = arr[i][j];
            idx++;
        }

        for (int i = maxR, j = minC + 1; j <= maxC; j++) {
            oneDArray[idx] = arr[i][j];
            idx++;
        }

        for (int i = maxR - 1, j = maxC; i >= minR; i--) {
            oneDArray[idx] = arr[i][j];
            idx++;
        }

        for (int i = minR, j = maxC - 1; j >= minC + 1; j--) {
            oneDArray[idx] = arr[i][j];
            idx++;
        }

        return oneDArray;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
