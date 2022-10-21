package pattern;

import java.util.Scanner;

public class patternSeven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = 0, st = 1;
        methodTwo(n);

        for (int i = 1; i <= n; i++) {

            if (sp > 0) {
                for (int j = 0; j < sp; j++) {
                    System.out.print("\t");
                }
            }
            for (int k = 0; k < st; k++) {
                System.out.print("*");
            }
            sp++;
            System.out.println();

        }
    }

    private static void methodTwo(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                  if(i==j) {
                   System.out.print("*");
               }
                   System.out.print("\t");
            }
              System.out.println();
          }
  }
}
