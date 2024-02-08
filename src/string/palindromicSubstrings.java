package string;

import java.util.Scanner;

class palindromicSubstrings {

    public  static  void main (String[]args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter String");

        String s = scn.nextLine();

        for(int i=0;i<s.length()+1;i++){
            for(int j=i+1;j<=s.length();j++){
               String str =  s.substring(i,j);

               if(isPalindrome(str)){
                   System.out.println(str);
               }
            }
        }

    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while(i<=j){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(j);

           if(ch1!=ch2){
             return false;
           }else{
               i++;
               j--;
           }
        }

       return true;
     }


}
