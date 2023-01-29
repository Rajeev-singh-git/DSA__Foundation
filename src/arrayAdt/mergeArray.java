package arrayAdt;

public class mergeArray {

    public static void main(String []args){

        int [] arr = {5,15,20,45,90};
        int [] arr2 = {10,16,25,45,80};
        int [] merged = new int[arr.length+arr2.length];
        merge(arr,arr2,merged);
        display(merged);

   }

    public static void merge(int []arr,int[]arr2,int []merged){
        int i=0,j=0,k=0;
        int m=arr.length,n=arr2.length;

        while(i<n && j<m){
            if(arr[i]<arr2[j])
                merged[k++]=arr[i++];
            else
                merged[k++]=arr2[j++];
         }
        for(;i<m;i++){
            merged[k++]=arr[i];
        }
        for(;j<n;j++){
            merged[k++]=arr[j];
        }
   }
    public static  void display (int [] merged){
        for(int n:merged){
            System.out.print(n+ " ");
        }
    }

}
