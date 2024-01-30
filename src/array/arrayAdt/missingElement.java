package array.arrayAdt;

public class missingElement {

    public static void main(String []args){

        int [] A = {1,2,3,4,5,6,7,8,10,11,12};
        int [] NS = {6,7,9,10,11,12,13,14,15,16,17};
        int [] MS = {6,7,9,10,11,12,15,16,17,18,19,25};
        int [] unSorted = {3,4,7,9,12,6,11,2,10,18};

        singleMissingElementFirstNNaturalNo(A);
        singleMissingElementAnySortedNaturalNo(NS);
        multipleMissingElements(MS);
        methodTwoMultipleMissingElements(unSorted);
    }
    private static void singleMissingElementFirstNNaturalNo(int[] a) {
        int n = a[a.length-1];
        int sum = (n*(n+1))/2;

        int arraySum = 0;

        for(int s:a) arraySum += s;

        System.out.println("Missing element for first n natural number is " + (sum-arraySum));
  }

    private static void singleMissingElementAnySortedNaturalNo(int[] ns) {
        int diff = ns[0]-0;

        for(int i=0;i<ns.length;i++){
            if(diff!=ns[i]-i){
                System.out.println("Single missing element for random Sorted natural number is " + (i+diff));
                break;
            }
        }
    }

    private static void multipleMissingElements(int[] ms) {
        int diff = ms[0]-0;


        System.out.println("Multiple missing elements are");
        for(int i=0;i<ms.length;i++){
            if(diff!=ms[i]-i){
                while(diff<ms[i]-i){
                   System.out.print(i+diff + " ");
                   diff++;
                }
            }
        }
        System.out.println();

    }

    private static void methodTwoMultipleMissingElements(int[] ms) {
        int max=ms[0];

        for(int n:ms){
            if(max<n)
                max=n;
        }

        int min=ms[0];

        for(int n:ms){
            if(min>n)
                min=n;
        }

        int [] H = new int[++max];

//        for(int i=0;i<ms.length;i++){
//            H[ms[i]]++;
//        }

        for(int n:ms) H[n]++;

        System.out.println("Multiple missing elements using method two");

        for(int i=min;i<max;i++){
           if(H[i]==0){
               System.out.print(i + " ");
           }
        }
  }

}
