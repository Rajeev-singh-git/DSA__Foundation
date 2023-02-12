package twoDarray;

import java.util.Scanner;

public class arrayMultiplication {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int ra1 = scn.nextInt();
        int ca1 = scn.nextInt();

        int [][] a1 = new int[ra1][ca1];

        for(int i=0;i<ra1;i++){
            for(int j=0;j<ca1;j++){
                a1[i][j]=scn.nextInt();
            }
        }

        int ra2 = scn.nextInt();
        int ca2 = scn.nextInt();

        int [][] a2 = new int[ra2][ca2];

        for(int i=0;i<ra2;i++){
            for(int j=0;j<ca2;j++){
                a2[i][j]=scn.nextInt();
            }
        }


        if(ca1!=ra2){
            System.out.println("Invalid input");
            return;
        }
        int[][]a3 = new int[ra1][ca2];

        for(int i=0;i<a3.length;i++){
            for(int j=0; j<a3[0].length ;j++){
                for(int m=0; m<a2.length;m++){
                    a3[i][j] +=a1[i][m]*a2[m][j];
                }
            }
        }




        for(int s=0;s<a3.length;s++){
            for(int t=0;t<a3[0].length;t++)  {
                System.out.print(a3[s][t]+" ");
            }
            System.out.println();
        }

        System.out.println("No of row in matrix " +a3.length);
        System.out.println("No of column in matrix " +a3[0].length);

        System.out.println("Multiply matrix");

        multiplyMatrix(a1,a2);


    }



    static void multiplyMatrix(int A[][], int B[][]){

        int colA = A[0].length;
        int rowB = B.length;

        int[][] res = new int[A.length][B[0].length];

        if(colA!=rowB){
            System.out.println("Multiplication not possible");
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k=0;k< B.length;k++){
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }


        for(int s=0;s<res.length;s++){
            for(int t=0;t<res[0].length;t++)  {
                System.out.print(res[s][t]+" ");
            }
            System.out.println();
        }


    }
}
