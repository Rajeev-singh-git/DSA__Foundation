package array.twoDarray;

import java.util.Scanner;

public class saddlePoint {

    public static void main(String []args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][]ar = new int[n][m];

        for(int i=0;i< ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                ar[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i< ar.length;i++){
            int svj=0;
            for(int j=1;j<ar[0].length;j++){
              if(ar[i][j]<ar[i][svj]){
                  svj=j;
              }
            }


            boolean flag = true;

            for(int k=0;k<ar.length;k++){
                if(ar[k][svj]>ar[i][svj]){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(ar[i][svj]);
                return;
            }

        }

        System.out.println("Invalid input");


    }

}
