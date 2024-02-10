package map.hashmap.basic;

import java.util.HashMap;
import java.util.Set;

public class hashMapBasic {

    public static void main(String[] args) throws Exception{
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",135);
        hm.put("China",200);
        hm.put("Pak",30);
        hm.put("US",20);

        System.out.println(hm);  // {China=200, Pak=30, US=20, India=135}

        hm.put("India",200);
        hm.put("US",25);

        System.out.println(hm);  // {China=200, Pak=30, US=25, India=200}

        System.out.println(hm.get("India"));  //200
        System.out.println(hm.get("Russia"));  // null


        System.out.println(hm.containsKey("India"));  // true
        System.out.println(hm.containsKey("Russia")); // false

        Set <String> keys = hm.keySet();
        System.out.println(keys);           // [China, Pak, US, India]

        for(String key :hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }

        /*China 200
        Pak 30
        US 25
        India 200

         */


    }

}
