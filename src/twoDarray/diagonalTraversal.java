package twoDarray;

import java.util.Scanner;

public class diagonalTraversal {

    public static  void main (String[]args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][]arr = new int[n][n];

        for (int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int minC = 0;
        int maxC = arr[0].length-1;

        while(minC<=maxC) {
            int minR=0;
            for (int i = minR, j = minC; j <= maxC; i++, j++) {
                      System.out.println(arr[i][j]);
                 }
           minC++;
         }

 }


}
