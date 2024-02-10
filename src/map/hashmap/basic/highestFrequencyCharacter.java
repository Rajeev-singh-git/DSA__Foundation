package map.hashmap.basic;

import java.util.HashMap;
import java.util.Scanner;

public class highestFrequencyCharacter {

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int oldfreq = hm.get(ch);
                int newfreq = oldfreq + 1;
                hm.put(ch,newfreq);
            }else {
                hm.put(ch,1);
            }
        }

        char maxfreqChar = str.charAt(0);

        for(Character key: hm.keySet()){
            if(hm.get(key)>hm.get(maxfreqChar)){
                maxfreqChar = key;
            }
        }

        System.out.println(maxfreqChar +" is char with max frequency of " +hm.get(maxfreqChar));


    }
}
