package array.arrayAdt;

import java.util.Scanner;

public class get_set_max {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr ={4,8,10,15,25,78,99,110,118,145,190,210,225};

        System.out.println("Enter index of element you want");
        int key = scn.nextInt();
        System.out.println("element is "+get(arr,key));
        System.out.println("Enter index and element you want to set");
        int idx = scn.nextInt();
        int element = scn.nextInt();
        set(arr,idx,element);
        System.out.println("Array after Set");
        printElement(arr);
        System.out.println("Maximum element is "+max(arr));
        System.out.println("Minimum element is "+min(arr));
        System.out.println("Sum of array using iterative method "+sum(arr));
        System.out.println("Sum of array using recursion "+ sumRec(arr,arr.length-1));
        System.out.println("Average of array is "+avg(arr));
    }

    public static int get(int[]arr,int k){
        if(k>=0 && k< arr.length)
            return arr[k];
        return -1;
   }

    public static void set(int[]arr,int idx, int k){
        if(idx>=0 && idx< arr.length)
            arr[idx]=k;
  }

    public static int max(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
      return max;
    }

    public static int min(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }


    public static int sum(int[]ar){
        int sum =0;
        for(int n:ar){
            sum +=n;
        }
        return sum;
    }

    public static int sumRec(int[]ar,int n){
        if(n<0)
            return 0;
      else
        return sumRec(ar,n-1)+ar[n];
    }

    public static int avg(int []arr){
        int sum =0,avg=0;
        for(int n:arr){
            sum +=n;
        }
        avg =  sum/arr.length;
        return avg;
    }

    public static void printElement(int[] arr) {
        for(int n:arr){
            System.out.print(n +" ");
        }
        System.out.println();
    }
}



