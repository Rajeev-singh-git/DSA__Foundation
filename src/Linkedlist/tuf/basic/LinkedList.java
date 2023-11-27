package Linkedlist.tuf.basic;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList{

    /*
    public static void main(String [] args){
       int [] arr = {2,5,6,8};
       Node y = new Node(arr[3]);
       System.out.println(y.data);
       System.out.println(y.next);
    } */

    public static void main(String [] args){
        int [] arr = {2,5,6,8};
        Node head = convertArr2LL(arr);
        System.out.println("Head is "+ head.data);
        System.out.println("Traversed linkedlist is ");
        Node temp = head;
        while(temp!=null){
             System.out.println(temp.data);
             temp =  temp.next;
        }
    }

    private static Node convertArr2LL(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i< arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

}