package Style;

import java.util.Scanner;

public class patternTwelve {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        betterMethod(n);

        int fib=0,lv=0,slv;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fib+"\t");
                if(i<=2 && j<2){
                    lv=1;
                    slv=0;
                    fib=lv+slv;
                }else{
                    slv=lv;
                    lv=fib;
                    fib=lv+slv;
                }
            }
            System.out.println();
        }

    }

    private static void betterMethod(int n) {

        int a=0;
        int b=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c;
               }
            System.out.println();
        }
    }
}
