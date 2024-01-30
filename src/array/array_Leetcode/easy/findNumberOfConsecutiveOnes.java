package array.array_Leetcode.easy;

import java.util.Scanner;

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2

 */

public class findNumberOfConsecutiveOnes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of the array ");


        int n = scn.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the values in array, must be either 0 ar 1 ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }

        System.out.println("Maximum no of consecutive once " +findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int mc = 0;
        int cc = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                cc++;
            }
            if(nums[i]==0 || i==nums.length-1){
                if(cc>mc){
                    mc=cc;
                }
                cc=0;
            }

        }
        return mc;

    }


}