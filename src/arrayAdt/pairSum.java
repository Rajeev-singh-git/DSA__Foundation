package arrayAdt;

public class pairSum {


    public static void main(String[] args) {
        int[] arr = {6,3,8,0,16,7,5,2,9,4};
        int[] sortedArray = {1,3,4,5,6,8,9,10,12,14};
        int Sum = 10;
        pairSumUnsorted(arr, Sum);
        pairSumUnsortedHashing(arr, Sum);
        pairSumSorted(sortedArray, Sum);

    }


    private static void pairSumUnsorted(int[] arr, int sum) {

        System.out.println("Pairs having sum of " + sum + " are");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    System.out.print(arr[i] + " " + arr[j]);
            }
            System.out.println();
        }

    }

    private static void pairSumUnsortedHashing(int[] arr, int sum) {

        int max = 0;
        for (int n : arr) {
            if (max < n)
                max = n;
        }

        int[] H = new int[max + 1];

        System.out.println("Pairs having sum of " + sum + "  using Hashing method are");

        for (int i = 0; i < arr.length; i++) {
            if (sum - arr[i] > 0 && H[sum - arr[i]] != 0) {
                System.out.print(arr[i] + " " + (sum - arr[i]));
                System.out.println();
            }
            H[arr[i]]++;
        }
    }

    private static void pairSumSorted(int[] sortedArray, int Sum) {

        System.out.println("Pairs having sum of " + Sum + "  for Sorted array are");

        for (int i = 0, j = sortedArray.length - 1; i < j; ) {

            if (sortedArray[i] + sortedArray[j] == Sum) {
                System.out.println(sortedArray[i] + " " + sortedArray[j]);
                i++;
                j--;
                System.out.println();
            } else if (sortedArray[i] + sortedArray[j] < Sum) {
                i++;
            } else {
                j--;
            }
        }
    }

}
