package array.Basic;

public class arrayDeclaration {


    public  static  void main(String[]args){
        oneDimesnsionalArray();

        System.out.println("Array values");
        declaration();

      }

   static void oneDimesnsionalArray(){
       int [] array = new int[3];
       for(int num:array){
           num+=1;
           System.out.println(+num);
       }

       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
           System.out.println(array);
       }
   }

    void twoDimesnsionalArray(){
        int[][] a=new int[2][];
        a[0]=new int[3];
        a[1]=new int[2];
     }

    void threedimensionalArrray(){
        int[][][] a=new int[2][][];
        a[0]=new int[3][];
        a[0][0]=new int[1];
        a[0][1]=new int[2];
        a[0][2]=new int[3];
        a[1]=new int[2][2];
        a[3]=new int[2][2];
    }

    static  void  declaration(){
        int[][] singleLineDec={{10,20,30},{40,50}};

        for(int i=0;i<singleLineDec.length;i++){
            for (int j=0;j<singleLineDec.length;j++){
                System.out.println(singleLineDec[i][j]);
            }
        }


    }


}



