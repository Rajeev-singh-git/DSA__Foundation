package arrayAdt;

public class duplicateElement {

    public static void main(String [] args){

        int [] arr = {3,3,6,7,7,14};
        int [] unSorted = {18,18,3,3,6,7,14,14,15,15,15};

          findDuplicate(arr);
          countDuplicate(arr); //if last number is repeating, this code is not working, do check again
          countDuplicateHash(arr);
          countDuplicateUnsorted(unSorted);


    }

    private static void findDuplicate(int[] arr) {
        int  lastDuplicate=0;

        System.out.println("Duplicate elements are ");

        for(int i=0;i<arr.length-1;i++){
           if(arr[i]==arr[i+1] && lastDuplicate!=arr[i]){
                System.out.print(arr[i] + " ");
                lastDuplicate=arr[i];
              }
        }
        System.out.println();
    }


    private static void countDuplicate(int[] arr) {



        for(int i=0;i<arr.length-1;i++){

            int count =1;

               while(arr[i]==arr[i+1])
               {
                   count++;
                   i++;
               }
               if(count>1)
               System.out.println(arr[i]+ " comes " +count+ " times");


        }

    }

    private static void countDuplicateHash(int[] arr) {

        int max=0;
        for(int n:arr){
            if(max<n)
             max=n;
        }

        int [] Hash = new int[max+1];


       for(int i=0;i<arr.length;i++){
           Hash[arr[i]]++;
       }

        for(int i=0;i<Hash.length;i++){
            if(Hash[i]>1)
                System.out.println(i+ " comes " +Hash[i]+ " times using Hash " );
        }

    }

    private static void countDuplicateUnsorted(int[] arr) {

       for (int i=0;i<arr.length-1;i++){
            int  count =1;
            if(arr[i]!=-1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
            }

            if(count>1)
                System.out.println(arr[i]+ " is coming " + count + " times");
       }
    }



}
