package pattern;

import java.util.Scanner;

public class patternEighteen {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        betterApproach(n);
        int st = 1;
        int newSt = 3;
        int outerSp = 1;
        int innerSp = n - 4;


        System.out.println("Method 1");

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++)
                    System.out.print("*\t");
            } else {
                for (int k = 1; k <= outerSp; k++) {
                    System.out.print("\t");
                }
               {   if(i<=n/2+1) {
                   for (int l = 1; l <= st; l++) {
                       System.out.print("*\t");
                   }
                 }else{
                   for (int l = 1; l <= newSt; l++) {
                       System.out.print("*\t");
                   }

               }
                }

                    for (int m = 1; m <= innerSp; m++) {
                        System.out.print("\t");
                    }
                    if (i <= n / 2) {
                        for (int p = 1; p <= st; p++) {
                            System.out.print("*\t");
                        }
                    }
                }

                if (i <=n / 2 && i != 1) {
                    innerSp -= 2;
                    outerSp++;
                }else if(i>n/2){
                    outerSp--;
                }
                if(i>=n/2+2){
                    newSt+=2;
                }

                System.out.println();
            }


        }

    private static void betterApproach(int n) {

        int st=n;
        int sp=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i>1 && i<=n/2 && j>1 && j<st){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }

            if(i<=n/2){
                st -=2;
                sp++;
            }else{
                sp--;
                st+=2;
            }

            System.out.println();
       }
  }

}





