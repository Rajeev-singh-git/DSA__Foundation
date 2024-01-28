package array.array_Leetcode.easy;

import java.util.Scanner;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */
public class findMissingNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of the array ");


        int n = scn.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the values in array (all values should be unique, smaller than or equal to n, 1 value should be missing ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println("Missing Number using Brute Force approach "+ BruteMissingNumber(nums));



    }

    private static int BruteMissingNumber(int[] nums) {

        int n = nums.length;

        boolean flag = false;


        for(int i=0;i<n;i++){
            flag = false;

            for(int j=0;j<n;j++){
                if(i==nums[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                return i;

        }
        return n;

    }
}
