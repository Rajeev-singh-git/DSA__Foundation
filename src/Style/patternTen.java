package Style;

import java.util.Scanner;

public class patternTen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int osp=n/2, isp=-1;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int l=1;l<=isp;l++){
                System.out.print("\t");
            }
            if(isp>=1) {     // or      if(i!=1 && i!=n)   or      if(i>1 && i<=n)
                System.out.print("*");
            }
             System.out.println();
                if(i<=n/2){
                    osp--;
                    isp +=2;
                }else{
                    osp++;
                    isp -=2;
                }
              }
        }


}
