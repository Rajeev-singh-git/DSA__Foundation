package Basic;

import java.util.Scanner;

public class reverseDigit {

    public  static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number you want to Reverse");
        int n = scn.nextInt();
        int rev =   reversed(n);
        System.out.println("Reversed digit is and is not more than 32 bit and  digit is  = "+rev);
    }

    private static int reversed(int x) {
      int rev =0;

      while(x!=0){
          int ld = x %10;
          rev = (rev*10)+ld;
          x = x/10;
      }

      if(rev<Integer.MAX_VALUE && rev>Integer.MIN_VALUE){
          return rev;
      }else{
          return 0;
      }


    }
}
