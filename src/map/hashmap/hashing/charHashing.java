package map.hashmap.hashing;

import java.util.Scanner;

public class charHashing {


        public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

            // Input string
            String s = scanner.next();

            // Precompute
            int[] hash = new int[256];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i)]++;
            }


                char c = scanner.next().charAt(0); // Fetch
                System.out.println(hash[c]); // Display frequency of character

        }


}
