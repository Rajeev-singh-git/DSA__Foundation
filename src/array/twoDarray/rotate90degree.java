package array.twoDarray;

import java.util.Scanner;

public class rotate90degree {


    public static void main(String[]args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
    //    int m = scn.nextInt();

        int[][] arr = new int[n][n];
        int[][] arr2 = new int[n][n];

        for (int i = 0; i < arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int k=arr[0].length-1;

        

        while(k>=0) {
            for (int i = 0; i < arr.length; i++) {
                int s = 0;
                for (int j = 0; j < arr[0].length; j++) {

                    while (s == j) {
                        arr2[s][k] = arr[i][j];
                        s++;
                    }
                }
                k--;
            }
        }

        display(arr2);

//        for (int i = 0; i < arr2.length;i++){
//            for(int j=0;j< arr2[0].length;j++){
//               System.out.print(arr2[i][j] +" " );
//            }
//            System.out.println();
//        }


    }

    private static void display(int[][] arr2) {

           for (int i = 0; i < arr2.length;i++){
            for(int j=0;j< arr2[0].length;j++){
               System.out.print(arr2[i][j] +" " );
            }
            System.out.println();
        }

    }

}
