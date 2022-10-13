package function;

import java.util.Scanner;

public class anyBaseSubtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int sub=0;
        int c=0,d1,d2;
        int pow=1;

        while(n2>0){

            d1 = n1%10;
            d2 = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int  d=0;
            d2 = d2+c;


           if(d2>=d1){
                d = d2-d1;
                c=0;
            }else{
                d = (d2+b)-d1;
                c=-1;
            }
            sub += d*pow;
            pow *= 10;

           }

        return sub;

    }


}
