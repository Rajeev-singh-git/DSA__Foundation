package array.two_d_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rotateArray {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a,int i,int j){
        int i1 =i;
        int j1 =j;

        while(i1<j1){
            int temp=a[i1];
            a[i1]=a[j1];
            a[j1]=temp;
            i1++;
            j1--;
        }

    }

    public static void rotate(int[] a,int k){
        k = k % a.length;
        if(k<0){
            k = k+a.length;
        }
        //part 1
        reverse(a,0,a.length-k-1);
        //part 2
        reverse(a,a.length-k,a.length-1);
        //part 3
        reverse(a,0,a.length-1);

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
}
