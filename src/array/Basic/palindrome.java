package array.Basic;

import java.util.Scanner;

public class palindrome {

    public  static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = scn.nextInt();
        isPalindrome(n);

    }

    private static void isPalindrome(int n) {
        int rev = 0;
        int num = n;
        if(n<0){
            System.out.println(n +" is not palindrome");
            return;
        }

        while(n!=0){
            int ld = n % 10;
            rev = (rev*10)+ld;
            n = n/10;
        }

        if(rev==num)
            System.out.println(num +" is  palindrome");
        else
            System.out.println(num +" is not palindrome");

    }
}
