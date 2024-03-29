package string;

import java.util.Scanner;

class stringCompression {
    public static String compression1(String str) {
        String s = str.charAt(0)+"";

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr!=prev){
                s += curr;
            }

        }
        return s;
    }

    public static String compression2(String str) {
        int count=1;
        String s = str.charAt(0)+"";

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
               count++;
            }else{
                if(count>1){
                    s += count;
                    count = 1;
                }
                    s += curr;
            }
        }
        if(count>1){
            s += count;
        }
            return s;
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }


}
