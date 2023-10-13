package array.array_Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kidWithExtraCandies {

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] candies = new int[n];

        for(int i=0;i<candies.length;i++){
            candies[i]=scn.nextInt();
        }

        int extraCandies = scn.nextInt();

        System.out.println(kidsWithCandie(candies,extraCandies));

    }



    public static List<Boolean> kidsWithCandie(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int n : candies)
            max = Math.max(max, n);

        System.out.println("Max is " +max);

        for(int i = 0; i < candies.length; i++){
            res.add((extraCandies + candies[i] >= max));
        }
        return res;
    }
}
