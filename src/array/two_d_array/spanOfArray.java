package array.two_d_array;

import java.util.Scanner;

public class spanOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int  n = scn.nextInt();

        int [] arr = new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){

       //     System.out.println("In loop");

            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int span = max-min;

        System.out.println(span);

    }



}
