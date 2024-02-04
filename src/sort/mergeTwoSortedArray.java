package sort;

public class mergeTwoSortedArray {


    public static void main(String [] args){

    //    int [] arr1 = {2,4,8,12,18}; {1,2,3,0,0,0
    //    int [] arr2 = {1,3,5,7,9};

        int [] arr1 = {1,2,3};
        int [] arr2 = {2,5,6};

        int n = arr1.length;
        int m = arr2.length;

        int [] res =  mergeArray(arr1,arr2,n,m);

        for(int num:res)
          System.out.print(num + " ");

//        int [] res2 =  merge(arr1,n,arr2,m);
//
//        for(int num:res2)
//            System.out.print(num + " ");

    }


//    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = m - 1;
//        int p2 = n - 1;
//        int pMerge = m + n - 1;
//
//        while (p2 >= 0) {
//            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
//                nums1[pMerge--] = nums1[p1--];
//            } else {
//                nums1[pMerge--] = nums2[p2--];
//            }
//        }
//
//         return  nums1;
//    }

    private static int [] mergeArray(int[] arr1, int[] arr2, int n, int m) {

        int [] res = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }else{
                res[k]=arr2[j];
                j++;
                k++;
            }

        }

        while(i<n){
            res[k]=arr1[i];
            i++;
            k++;
        }

        while (j<m){
            res[k]=arr2[j];
            j++;
            k++;
        }

        return res;
   }


}
