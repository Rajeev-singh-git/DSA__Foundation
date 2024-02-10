package map.hashmap.basic;

import java.util.HashMap;
import java.util.Scanner;

public class longestConsecutiveElement {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of the Array 1");

        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter element of the Array 1");

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        LongestConsecutiveElement(arr);

 }

    private static void LongestConsecutiveElement(int[] arr) {

        HashMap<Integer,Boolean> hm = new HashMap<Integer, Boolean>();
        for(int num:arr){
            hm.put(num,true);
        }
        for(int num:arr){
           if(hm.containsKey(num-1)){
               hm.put(num,false);
           }
        }
        int longestLength=0;
        int startPoint = 0;
        for(int num:arr){
            int cstartPoint = num;
            int length = 1;
            while(hm.containsKey(cstartPoint+length)){
                length++;
            }
            if(length>longestLength){
                longestLength=length;
                startPoint=num;
            }
        }
        for(int i=startPoint;i<longestLength+startPoint;i++){
            System.out.print(i + " ");
        }
    }
}
