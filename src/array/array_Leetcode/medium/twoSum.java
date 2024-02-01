package array.array_Leetcode.medium;

import java.util.Scanner;

public class twoSum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter size of the Array");
        int n = scn.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements  of the Array");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println("Enter Target value");

        int target = scn.nextInt();

        BruteForceTarget(nums,target);

    }

    private static void  BruteForceTarget(int[] nums, int target) {

        int [] result = new int[2];
        int val = 0;

        for(int i=0;i<nums.length;i++){
            val = 0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    val=1;
                    break;
                }
            }
            if(val==1)
               break;
        }

        if(val==1) {
            System.out.println("Target value using Brute Force ");
            for (int n : result) {
                System.out.println(n);
            }
        }else{
            System.out.println("Target not available using Brute force");
        }



    }
}



