package Style;

import java.util.Scanner;

public class patternEight {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = n-1, st = 1;
        betterMethod(n);

        for (int i = 1; i <= n; i++) {

            if (sp > 0) {
                for (int j = 0; j < sp; j++) {
                    System.out.print("\t");
                }
            }
            for (int k = 0; k < st; k++) {
                System.out.print("*");
            }
            sp--;
            System.out.println();

        }
    }

    private static void betterMethod(int n) {

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n ; j++) {
                if(i+j==n+1) {
                    System.out.print("*");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
