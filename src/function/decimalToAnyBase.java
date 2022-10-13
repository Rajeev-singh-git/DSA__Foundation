package function;

import java.util.Scanner;

public class decimalToAnyBase {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){

        int rem;
        int p=1;
        int num=0;

        while(n>0){

            rem = n%b;
            n=n/b;
            num += (rem*p);
            p *= 10;
        }

        return num;

    }





}
