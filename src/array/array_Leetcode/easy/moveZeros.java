package array.array_Leetcode.easy;

import java.util.Scanner;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
 */

public class moveZeros {



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
              nums[i] = scn.nextInt();
        }

      int [] arr = moveZeroes(nums);

        for(int num:arr){
            System.out.print(num + " ");
        }

    }


        public static int[] moveZeroes(int[] nums) {

            int j=-1;

            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) {
                    j = i;
                    break;
                }
            }

            if(j==-1)
                return nums;

            for(int i=j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    //      nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                    j++;
                }
            }

            return nums;


    }

}
