package map.hashmap.hashing;

import java.util.Scanner;

public class hashing {

    public  static  void main(String[] args){

      Scanner scn = new Scanner(System.in);

      int [] arr = {2,5,5,4,3,9,2};


       // taking size of hashArray 12, as no element in array is not more than 10
      int [] hashArray = new int[12];


      for(int i=0;i<arr.length;i++){
          hashArray[arr[i]] +=1;
      }



      // we can see in output number of time value appear
      for(int n: hashArray){
          System.out.println(n);
      }

    }



}
