package array.twoDarray;

import java.util.Scanner;

public class spiralMatrix {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] ar = new int[n][m];


        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                ar[i][j] = scn.nextInt();
            }
        }

        int maxR = ar.length - 1;
        int maxC = ar[0].length - 1;
        int minR = 0;
        int minC = 0;


        int tn = m * n;
        int count = 0;

        while (count < tn) {

            for (int i = minR, j = minC; i <= maxR &&  count < tn; i++) {
                System.out.println(ar[i][j]);
                count++;
            }
            minC++;

            for (int i = maxR,j = minC; j<= maxC &&  count < tn; j++) {
                System.out.println(ar[i][j]);
                count++;
            }
            maxR--;

            for (int i = maxR,j = maxC; i >= minR &&  count < tn; i--) {
                System.out.println(ar[i][j]);
                count++;
            }
            maxC--;

            for (int i = minR,j = maxC; j >= minC &&  count < tn; j--) {
                System.out.println(ar[i][j]);
                count++;
            }
            minR++;


        }
    }
}
