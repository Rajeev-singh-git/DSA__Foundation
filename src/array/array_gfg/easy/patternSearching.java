package array.array_gfg.easy;

import java.util.Scanner;

public class patternSearching {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        checkPattern(s1,s2);

        System.out.println("Approach 2 ..................................................");
        isPatternMatched(s1,s2); //better Method
    }

    private static void isPatternMatched(String s1, String s2) {

        if (s1.contains(s2))
            System.out.println("Pattern Matched");
         else
            System.out.println("Pattern didn't  Matched");

    }

    private static void checkPattern(String s1, String s2) {

        int j=0;
        int size = s2.length();


        for(int i=0;i<s1.length();i++){

            if(s1.charAt(i)==s2.charAt(j)){
                j++;
                if(j==size){
                   System.out.println("Pattern Matched");
                   break;
                }
            }
        }

        if(j!=size)
        System.out.println("Pattern didn't Matched");

    }

}
