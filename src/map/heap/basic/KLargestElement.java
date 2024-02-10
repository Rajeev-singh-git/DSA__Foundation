package map.heap.basic;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of the Array ");

        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter element of the Array ");

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter no of top element which you want to select");
        int k = scn.nextInt();

        largestElement(arr,k);

   }

    private static void largestElement(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

       for(int i=0;i<arr.length;i++){
           if(i<k){
               pq.add(arr[i]);
           }else{
               if(arr[i]>pq.peek()){
                   pq.remove();
                   pq.add(arr[i]);
               }
           }

       }

       while(pq.size()>0){
           System.out.println(pq.remove());
       }
    }
}

/*
Enter length of the Array
7
Enter element of the Array
2
10
5
17
7
18
7
Enter no of top element which you want to select
3
10
17
18
 */