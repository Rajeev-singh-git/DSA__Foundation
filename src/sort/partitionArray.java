package sort;

import java.util.Scanner;

public class partitionArray {

    public static  void main(String [] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter Elements of the array");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter pivot");
        int pivot = scn.nextInt();


       int [] result =  ArrayPartition(arr,pivot);

       for(int res:result){
           System.out.print(res +" ");
       }


    }

    public static int [] ArrayPartition(int [] arr, int pivot){

        int i=0;
        int j=0;

        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }

        return arr;

    }

    private static void swap(int[] arr, int i, int j) {

        arr[i] = arr[i]+arr[j]-(arr[j]=arr[i]);

//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
    }


}

/*Enter the size of the array
5
Enter Elements of the array
12
100
18
99
21
Enter pivot
25
12 18 21 99 100


Enter the size of the array
8
Enter Elements of the array
7
9
4
8
3
6
2
1
Enter pivot
5
4 3 2 1 9 6 7 8


 */