package arrayAdt;


public class reverseRotate {

    public static void main(String[] args) {
        
        int[] arr = {4, 8, 10, 12, 18, 24, 30, 36};

        reverseArray(arr);
        display(arr);

    }

    private static void reverseArray(int[]arr) {

        for(int i=arr.length-1,j=0;i>j;i--,j++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
       }
    }

    private static void display(int[]arr) {
        for(int n:arr){
        System.out.print(n + " ");
        }
    }
}
