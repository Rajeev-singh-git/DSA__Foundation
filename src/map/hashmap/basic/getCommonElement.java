package map.hashmap.basic;

import java.util.HashMap;
import java.util.Scanner;

public class getCommonElement {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of the Array 1");

        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter element of the Array 1");

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter length of the Array 2");

        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];

        System.out.println("Enter element of the Array 2");

        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }

        commonElement(arr,arr2);
        commonElement2(arr,arr2);


    }

    private static void commonElement(int[] arr, int[] arr2) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val:arr){
            if(hm.containsKey(val)){
                int cf = hm.get(val);
                int nf = cf+1;
                hm.put(val,nf);
            }else{
                hm.put(val,1);
            }
        }

        System.out.println("Common element 1: Common values are ");

        for(int val:arr2){
            if(hm.containsKey(val)){
                System.out.println(val);
                hm.remove(val);
            }

        }

    }

    private static void commonElement2(int[] arr, int[] arr2) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val:arr){
            if(hm.containsKey(val)){
                int cf = hm.get(val);
                int nf = cf+1;
                hm.put(val,nf);
            }else{
                hm.put(val,1);
            }
        }
        System.out.println("Common element 2: Common values are ");

        for(int val:arr2){
            if(hm.containsKey(val) && hm.get(val)>0){
                    System.out.println(val);
                    int cf = hm.get(val);
                    int nf = cf - 1;
                    hm.put(val, nf);
            }

        }
    }
}
