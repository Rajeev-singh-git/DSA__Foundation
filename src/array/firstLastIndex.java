package array;

import java.util.Scanner;

public class firstLastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();

        int []a = new int[n];


        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        int data = scn.nextInt();

        int l =0;
        int h =a.length-1;
        int lidx=0;

        while(l<=h){
            int m =(l+h)/2;

            if(data<a[m]){
                h=m-1;
            }else if(data>a[m]){
                l=m+1;
            }else{
                lidx=m;
                l = m+1;
            }
        }


         l =0;
         h =a.length-1;
        int hidx=0;

        while(l<=h){
            int m =(l+h)/2;

            if(data<a[m]){
                h=m-1;
            }else if(data>a[m]){
                l=m+1;
            }else{
                hidx=m;
                h = m-1;
            }
        }


        System.out.println(lidx);
        System.out.println(hidx);


    }

}
