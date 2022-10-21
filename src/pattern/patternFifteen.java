package pattern;

import java.util.Scanner;

public class patternFifteen {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int m = 1,s=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(j==1){
                    System.out.print(m+"\t");

                }else{
                    if(j==2)
                        s=m+1;

                    System.out.print(s+"\t");
                    if(j<=st/2){
                        s++;
                    }
                    else{
                        s--;
                    }
                }
            }
            System.out.println();
            if(i<=n/2){
                sp -=1;
                st +=2;
                m++;
            }else{
                sp +=1;
                st -=2;
                m--;
            }

        }

    }

}
