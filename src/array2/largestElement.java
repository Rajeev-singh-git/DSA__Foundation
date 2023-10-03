package array2;

import java.util.Scanner;

public class largestElement {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n = scn.nextInt();

        System.out.println("Enter elements of the array");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int lar =  getlargestElement(arr);
        getSecondLargestElement_Naive_Method(arr, lar);
        getSecondLargestElement_Optimal_Method(arr);
    }

    private static void getSecondLargestElement_Optimal_Method(int [] arr) {
        int lar = 0;
        int sl = -1;

        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[lar]){
                    sl=lar;
                    lar = i;
            }else if(arr[i]!=arr[lar]){
                if(sl == -1 || arr[sl]<arr[i])
                    sl =i ;
            }
        }


            System.out.println("Optimal Method used ........................");

            System.out.println("Largest element is " + arr[lar] + " at index " + lar);

            if (sl != -1)
                System.out.println("Second Largest element is " + arr[sl] + " at index " + sl);
            else
                System.out.println("Second Largest element does not exist");

    }
    private static int getlargestElement(int[] arr) {
        int lar = 0;
        for(int i=1; i<arr.length;i++){
           if(arr[lar]<arr[i])
               lar = i;
        }

        System.out.println("Largest element is "+ arr[lar] + " at index "+lar);
        return  lar;
    }

    private static void getSecondLargestElement_Naive_Method(int[] arr, int lar) {

        int secLargest = -1;

        for(int i=0; i<arr.length;i++) {

            if (arr[i] != arr[lar]) {
               if(secLargest==-1){
                  secLargest = i;
               }else if(arr[secLargest]<arr[i])
                   secLargest = i;
            }
        }

        System.out.println("Naive Method used ........................");


        if(secLargest != -1) {
            System.out.println("Second Largest element is " + arr[secLargest] + " at index " + secLargest);
        }else{
            System.out.println("Second Largest element does not exist");
        }
    }

}

