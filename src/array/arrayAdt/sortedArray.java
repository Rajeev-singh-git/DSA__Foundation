package array.arrayAdt;

public class sortedArray {
      public static void main(String[]args){
          int [] arr = new int[12];
          arr[0]=4;
          arr[1]=8;
          arr[2]=13;
          arr[3]=16;
          arr[4]=20;
          arr[5]=25;
          arr[6]=28;
          arr[7]=33;
          int size =8;
          int [] arr2 = {-1,6,8,9,-3,-5,9,8,99,55,-2,-1,6};
          int x = 3;

          System.out.println("Array before insertion");
          display(arr);
          insertInSortedPosition(arr,x,size);
          System.out.println("Array after insertion");
          display(arr);


          System.out.println(isSorted(arr,size));
          System.out.println(isSorted(arr2,size));
          rearrange(arr2);
          display(arr2);

      }

    private static void rearrange(int[] arr2) {
          int i=0,j=arr2.length-1;

          while(i<j){
              while(arr2[i]<0){
                  i++;
              }
              while(arr2[j]>=0){
                  j--;
              }
              if(i<j){
                  interchange(arr2,i,j);
              }
          }

    }

    private static void  interchange(int [] arr,int i, int j){
          int temp = arr[i];
          arr[i]  = arr[j];
          arr[j]  = temp;
      }

    private static boolean isSorted(int[] arr, int size) {
          int j=size-1;

          for(int i=0;i<j-1;i++){
              if(arr[i]>arr[i+1])
                  return false;
          }
          return true;
      }

    private static void insertInSortedPosition(int[] arr, int x,int size) {
        int j= size-1;

          if(size>=arr.length)
              return;


        while( j>=0  && arr[j]>x ){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=x;
      }

    private static void display(int[] arr){

          for(int n:arr){
              System.out.print(n + " ");
          }
        System.out.println();
    }

}
