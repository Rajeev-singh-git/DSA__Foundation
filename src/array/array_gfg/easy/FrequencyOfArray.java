package array.array_gfg.easy;

import java.util.Scanner;

public class FrequencyOfArray {

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
        frequencyCount(arr,arr.length);


    }

    private static void frequencyCount(int [] arr, int N) {


        int [] arr2 = new int[N];

        for(int i=1;i<=N;i++){
            int check =0;
            for(int j=0;j<N;j++){
                if(i==arr[j])
                    check +=1;
                }
               arr2[i-1]=check;
        }
          arr =arr2;


        System.out.println("Frequency of value of Array is");
        for(int n : arr)
            System.out.println(n);

    }


}
