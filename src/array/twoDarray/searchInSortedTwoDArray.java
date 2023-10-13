package array.twoDarray;

import java.util.Scanner;

public class searchInSortedTwoDArray {

    public static void main(String [] args){
       Scanner scn =  new Scanner(System.in);
       int n = scn.nextInt();

       int [][]ar = new int[n][n];

       for(int i=0;i<ar.length;i++){
           for(int j=0;j<ar[0].length;j++){
               ar[i][j]= scn.nextInt();
           }
       }

       int x = scn.nextInt();

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
               if(ar[i][j]==x){
                   System.out.println(i);
                   System.out.println(j);
                   break; //return;
               }else if(j+1==n && i+1 ==n){
                   System.out.println("Not found");
               }
            }
        }

       usingBST(ar,x);


    }

    private static void usingBST(int[][] ar, int x) {

        System.out.println("Using Binary Search Tree");

        int i=0;
        int j = ar[0].length-1;

        while (i< ar.length && j>=0){
            if(x==ar[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(x<ar[i][j]){
                j--;
            }else{
               i++;
            }

        }

        System.out.println("Not Found");

    }

}
