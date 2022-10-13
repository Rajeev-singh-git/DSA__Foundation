package function;

import java.util.Scanner;

public class anyBaseAddition {




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }



    public static int getSum(int b, int n1, int n2){
        // write ur code here

        int d1, d2,d;
        int sum =0;
        int pow =1;
        int c=0;
        while(n1>0 || n2>0 || c>0){

            d1 = n1%10;
            d2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

           d = d1+d2+c;
           c = d/b;
           d = d%b;

           sum += d*pow;
           pow *= 10;

        }
        return sum;
    }


}
