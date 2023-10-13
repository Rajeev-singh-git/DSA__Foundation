package array.array_Leetcode;

import java.util.Scanner;

public class employeeLongestTask {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] logs = new int[m][n];

        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs[0].length; j++) {
                logs[i][j] = scn.nextInt();
            }
        }

        hardestWorker(logs);
    }

    public static void hardestWorker(int[][] logs) {
        int start =0;
        int max=0;
        int id=0;
        for(int i=0;i< logs.length;i++){
            int timeTaken = logs[i][1]-start;

            if(max<timeTaken){
                max=timeTaken;
                id=logs[i][0];
            }

            if(max==timeTaken){
              id = Math.min(id,logs[i][0]);
            }
            start = logs[i][1];
        }

         System.out.println(id);
      }
}