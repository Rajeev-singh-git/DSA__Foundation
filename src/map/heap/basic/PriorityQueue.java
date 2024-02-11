package map.heap.basic;

import java.util.ArrayList;

public class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue(){
        data= new ArrayList<>();
    }


    public void add(int val){
        data.add(val);
        upheapify(data.size()-1);
    }

    private void upheapify(int i) {
        if(i==0){
            return;
        }
        int pi = (i-1)/2;
        if(data.get(i)< data.get(pi)){
            swap(i,pi);
            upheapify(pi);
        }

    }

    private void swap(int i, int j) {
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j,ith);
    }
    
    public int remove(){
        if(this.size()==0){
            System.out.println("underflow");
            return -1;
        }
        
        swap(0,data.size()-1);
        int val = data.remove(data.size()-1);
        downheapify(0);
        return val;
    }

    private int size() {
        return data.size();
    }

    private void downheapify(int pi) {

        int mini = pi;
        int li = 2*pi+1;

        if(li<data.size() && data.get(li)<data.get(mini)){
            mini = li;
        }

        int ri = 2*pi+2;
        if(ri<data.size() && data.get(ri)<data.get(mini)){
            mini = ri;
        }

        if(mini!=pi){
            swap(pi,mini);
            downheapify(mini);
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        // Adding elements to the priority queue
        pq.add(5);
        pq.add(10);
        pq.add(3);
        pq.add(7);
        pq.add(1);

        // Removing elements from the priority queue
        System.out.println("Removed element: " + pq.remove());
        System.out.println("Removed element: " + pq.remove());
        System.out.println("Removed element: " + pq.remove());
    }


}
