package map.heap.basic;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortUptoKStep {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of the Array ");

        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter element of the Array ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter max steps by which array is unsorted");
        int k = scn.nextInt();

        SortArray(arr, k);

    }

    private static void SortArray(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for(int i=k+1;i<arr.length;i++){
            System.out.print(pq.remove() +" ");
            pq.add(arr[i]);
        }

        while(pq.size()>0){
            System.out.print(pq.remove() + " ");
        }

    }

}

/*Enter length of the Array
9
Enter element of the Array
2
3
1
4
6
7
5
8
9
Enter max steps by which array is unsorted
3
1 2 3 5 6 7 8 9
 */