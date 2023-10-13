package array.array_Leetcode;

import java.util.Scanner;

public class removeDuplicateSortedArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] logs = new int[n];

        for (int i = 0; i < logs.length; i++) {
            logs[i] = scn.nextInt();
         }

        removeDuplicates(logs);
    }

    public static void removeDuplicates(int[] nums) {

        int [] expectedNums = new int[nums.length];
        int k=0;
        expectedNums[0]=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                expectedNums[cnt]=nums[i];
                cnt++;
            }
        }


        for(int i=0;i<expectedNums.length;i++){
            if(expectedNums[i]==0 && i!=0){
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(expectedNums[i]);
        }




    }

}
