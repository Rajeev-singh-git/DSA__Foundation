package array.arrayAdt;

import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr ={4,8,10,15,25,78,99,110,118,145,190,210,225};
        int l =0, mid=0;
        int h = arr.length-1;
        System.out.println("Enter key you want to search");
        int key = scn.nextInt();
        System.out.println("key is "+binarySearchIterative(arr,key,l,h,mid) + " method used = iterative binary search");
        System.out.println("key is "+ binarySearchRecursive(arr,key,l,h) + " method used = recursive binary search ");
    }

    private static int binarySearchIterative(int[] arr, int key, int l,int h, int mid) {

        while(l<=h){
            mid = (l+h)/2;
            if(key==arr[mid]){
                return mid;
            }else if(key<arr[mid]){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] arr, int key, int l,int h) {

      if(l<=h){
         int  mid=(l+h)/2;
          if(key==arr[mid]){
              return mid;
          }else if(key<arr[mid]){
              return binarySearchRecursive(arr,key,l,mid-1);
          }else{
              return binarySearchRecursive(arr,key,mid+1,h);
          }
      }
      return  -1;
    }
}
