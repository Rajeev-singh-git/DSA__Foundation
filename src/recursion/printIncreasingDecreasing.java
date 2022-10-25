package recursion;

import java.util.Scanner;

public class printIncreasingDecreasing {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {

        if (n > 0) {
            System.out.println(n);
            pdi(n - 1);
            System.out.println(n);
        }

    }


}
