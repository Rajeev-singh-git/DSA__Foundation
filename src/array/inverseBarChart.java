package array;

import java.util.Scanner;

public class inverseBarChart {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }

        int max = a[0];

        for(int i=1; i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }



        for(int floor=1;floor<=max;floor++){
            for(int j=0;j<a.length;j++){
                if(a[j]>=floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }


//        for(int floor=max; floor>=1;floor--){
//            for(int i=0;i<a.length;i++){
//                if(a[i]>=floor){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }




    }



}
