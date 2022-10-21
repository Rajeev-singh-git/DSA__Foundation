package string;

import java.util.Scanner;

public class permutationOfString {

    public static  void main(String []args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    private static void solution(String str) {

        int len = str.length();
        int f = factorial(len);

        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp =i;

            for(int div=len;div>0;div--){
                int quo = temp/div;
                int rem = temp%div;

                  System.out.print(sb.charAt(rem));
                  sb.deleteCharAt(rem);
                  temp =quo;

            }
            System.out.println();
        }

    }

    private static int factorial(int len) {
        int val = 1;
        for(int i=1;i<=len;i++){
            val *= i;
        }
        return val;
    }


}
