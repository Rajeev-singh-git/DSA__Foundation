package array.Basic;

import java.util.Scanner;

public class isPrime {

    public  static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number you want to check");
        int n = scn.nextInt();
//        boolean val = prime(n);
        prime(n);
//        if(val){
//            System.out.println(+n+ " is  prime");
//        }else{
//            System.out.println(+n+ " is not Prime");
//        }

    }

    private static void prime(int n) {

        int count = 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }

        if(count==0){
           System.out.print("Prime");
        }else{
            System.out.print("Not Prime");
        }

    }
}
