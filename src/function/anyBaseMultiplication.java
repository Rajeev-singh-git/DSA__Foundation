package function;
import java.util.*;

public class anyBaseMultiplication {

       public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            int d = getProduct(b, n1, n2);
            System.out.println(d);
        }

    public static int getProduct(int b, int n1, int n2) {
        int d2;
        int sprd;
        int product=0;
        int pow=1;

        while(n2>0){

            d2 = n2%10;
            n2 = n2/10;
            sprd = getSingleDigitProduct(b,n1,d2);
            product = getSum(b,product,sprd*pow);
            pow *=10;
        }
        return product;
    }

    private static int getSingleDigitProduct(int b, int n1, int n2) {
        int d1,m,c = 0,d;
        int rv = 0;
        int pow =1;
        while (n1 > 0 || c>0) {

            d1 = n1 % 10;
            n1 = n1 / 10;
            
            m = (d1 * n2) + c;
            c=0;
            d = m % b;
            c = m / b;
            rv += d * pow;
            pow *= 10;

        }
        return rv;
    }


    private static int getSum(int b, int no1, int no2) {
           int sum =0;
           int n1,n2,d1,d2,d,c=0,p = 1;

           while (no1 > 0 || no2>0 || c>0){
               d1 = no1 % 10;
               d2 = no2 % 10;

               no1 = no1/10;
               no2 = no2/10;

               d =  d1+d2+c;
               c = d/b;
               d = d%b;


              sum += d*p;
              p *= 10;

           }
             return  sum;
    }
}
