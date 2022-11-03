package recursion;

import java.util.Scanner;

public class powerLogarithmic {


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xn = power(x, n / 2);
        int xpn = xn * xn;

        if (n % 2 == 1) {
            xpn = x * xpn;
        }

         return xpn;
    }


}
