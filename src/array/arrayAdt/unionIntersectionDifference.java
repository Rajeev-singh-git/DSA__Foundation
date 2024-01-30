package array.arrayAdt;

public class unionIntersectionDifference {

    public static void main(String[] args){

        int [] as = {3,4,5,6,10};
        int [] bs = {2,4,5,7,12};
        int [] cs = new int [as.length+bs.length];

        sortedUnion(as,bs,cs);
        System.out.println("Union for sorted element");
        display(cs);
        System.out.println("Insertion for sorted array");
        sortedInsertion(as,bs);
        System.out.println("Difference for sorted array");
        sortedDiff(as,bs); //print  only those element which are not present in 2nd array
        
  }

    private static void sortedDiff(int[] as, int[] bs) {
        int i,j;
        i=j=0;

        while(i<as.length && j<bs.length){
            if(as[i]<bs[j])
                System.out.print(as[i++]+ " ");
            else if(bs[j]<as[i])
                j++;
            else if(as[i]==bs[j]) {
                i++;
                j++;
            }
        }
        for(;i<as.length;i++){
            System.out.print(as[i++]+ " ");
        }
        System.out.println();
    }

    private static void sortedInsertion(int[] as, int[] bs) {
        int i=0,j=0;

        while (i<as.length && j<bs.length){
            if(as[i]<bs[j])
                i++;
            else if(bs[j]<as[i])
                j++;
            else if(as[i]==bs[j]) {
                System.out.print(as[i++] + " ");
                j++;
            }
        }
        System.out.println();
    }

    private static void sortedUnion(int[] a, int[] b, int[] c) {
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){

            if(a[i]<b[j])
                  c[k++]=a[i++];
            else if(b[j]<a[i])
                   c[k++]=b[j++];
            else{
                c[k++]=a[i++];
                j++;
            }

        }

        for(;i<a.length;i++){
            c[k++]=a[i];
        }

        for(;j<b.length;j++){
            c[k++]=b[j];
        }
    }


     private static void display(int [] c){
        for(int n:c){
            System.out.print(n + " ");
        }
        System.out.println();
     }

}
