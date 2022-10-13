package array;

import java.util.Scanner;

public class subArray {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];

        for(int i=0;i<a.length;i++){
            a[i]= scn.nextInt();
        }

//       My approach
//
//        int st = 0;
//        while(st<a.length){
//            int il = 1;
//            while (il<=a.length){
//                int t=0;
//                for (int i=st; i<il;i++){
//                    System.out.print(a[i] + "\t");
//                    t++;
//                }
//                if(il<=a.length && t>0) {
//                    System.out.println();
//                }
//                  il++;
//            }
//          st++;
//       }


        //Better approach

     for(int i=0; i<a.length;i++){
         for(int j=i; j<a.length;j++){
             for(int k=i; k<=j;k++){
                 System.out.print(a[k] +"\t");
             }
             System.out.println();
         }
     }



    }
}
