package array.array_gfg.medium;

import java.util.Scanner;

public class smallestPositiveMissingNumber {


    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of the array");

        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter array with missing positive number");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        missingNumber(arr,arr.length);

    }

    static int segregateArr (int arr[], int n)
    {
        int j = 0, i;
        for(i = 0; i < n; i++)
        {
            if(arr[i] <= 0)
            {
                //changing the position of negative numbers and 0.
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                //incrementing count of non-positive integers.
                j++;
            }
        }
        return j;
    }

    //Finding the smallest positive missing number in an array
    //that contains only positive integers.
    static void findMissingPositive(int arr[],int st, int end)
    {

        //marking arr[i] as visited by making arr[arr[i]-1] negative.
        //note that 1 is subtracted because indexing starts from 0 and
        //positive numbers start from 1.
        for(int i=st; i<end; i++)
        {
            if(Math.abs(arr[i])+st - 1 < end && arr[ Math.abs(arr[i])+st - 1] > 0)
                arr[ Math.abs(arr[i])+st - 1] = -1*arr[ Math.abs(arr[i])+st - 1];
        }

        for(int i=st; i<end; i++)
        {
            if (arr[i] > 0)
            {
                //returning the first index where value is positive.
                // st is subtracted because we do not have to consider negative numbers present at the start of array.
                // 1 is added because indexing starts from 0.
           //     return i-st+1;
                System.out.println(i-st+1);
                return;
            }
        }
       // return end-st+1;
        System.out.println(end-st+1);
    }

    //Function to find the smallest positive number missing from the array.
    static void missingNumber(int arr[], int size)
    {
        //first separating positive and negative numbers.
        int shift = segregateArr(arr, size);

        //shifting the array to access only positive part.
        //calling function to find result and returning it.
        findMissingPositive(arr,shift, size);
    }
}
