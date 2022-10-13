package Style;

import java.util.Scanner;

public class patternSix {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();

        int st = (n / 2) + 1;
        int sp = 1;

        for (int i = 1; i <= n; i++) {
            for (int j=0; j<st; j++) {
                System.out.print("*\t");
            }
            for (int k=0 ; k<sp; k++) {
                System.out.print("\t");
            }
            for (int l=0; l<st; l++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i > n/2) {
                st++;
                sp -= 2;
            } else {
                st--;
                sp += 2;
            }

        }


    }
}
