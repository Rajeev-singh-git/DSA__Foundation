package map.heap.basic;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class basicSorting {

    public static void main(String[]args){

    //    PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int [] ranks = {22,18,99,3,11,6};

        for(int val:ranks){
            pq.add(val);
        }

        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}

/*
   PriorityQueue<Integer> pq = new PriorityQueue<>();


3
6
11
18
22
99
 */

/*
   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

99
22
18
11
6
3
 */
