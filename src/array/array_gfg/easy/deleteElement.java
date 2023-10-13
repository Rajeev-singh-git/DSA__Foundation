package array.array_gfg.easy;

import java.util.Scanner;

public class deleteElement {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = scn.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter value of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter element you want to Delete in Array");
        int element = scn.nextInt();
        delElement(arr,element);
    }

    private static   void delElement(int[] arr, int element) {
        int i;

        for(i=0;i<arr.length;i++){
            if(arr[i]==element)
                break;
        }

        if(i == arr.length){
            System.out.println("Element not found");
        }else {

            for(int j=i;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }

            System.out.println("Array after element deleted");

            for(int k=0;k<arr.length-1;k++)
                System.out.println(arr[k]);

          }
    }




}
