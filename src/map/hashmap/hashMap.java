package map.hashmap;


import java.util.ArrayList;
import java.util.LinkedList;

public class hashMap<K,V> {

    private class HMNode{
        K key;
        V value;

        HMNode(K key, V value){
            this.key = key;
            this.value=value;
        }
    }

    private int size;

    private LinkedList<HMNode>[] buckets;

    public hashMap(){
        initbuckets(4);
        size=0;
    }

    private void initbuckets(int N) {
        buckets = new LinkedList[N];
        for(int bi=0;bi<buckets.length;bi++){
            buckets[bi] = new LinkedList<>();
        }
    }

    public void put(K key, V value) throws Exception{
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);

        if(di!=-1){
            HMNode node = buckets[bi].get(di);
            node.value = value;
        }else{
            HMNode node = new HMNode(key,value);
            buckets[bi].add(node);
            size++;
        }
        double lambda = size*1.0/buckets.length;
        if(lambda>2.0){
            rehash();
        }
    }

    private void rehash() throws Exception{
        LinkedList<HMNode> [] oba = buckets;

        initbuckets(oba.length*2);
        size=0;

        for(int i=0;i< oba.length;i++){
            for(HMNode node: oba[i]){
                put(node.key, node.value);
            }
        }

    }

    private int hashfn(K key) {
        int hc = key.hashCode();
        return Math.abs(hc)%buckets.length;
    }

    private int getIndexWithinBucket(K key, int bi) {
        int di = 0;
        for(HMNode node: buckets[bi]){
            if(node.key.equals(key)){
                return di;
            }
            di++;
        }
       return -1;
    }

    public V get(K key) throws Exception{
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);

        if(di!=-1){
           HMNode node = buckets[bi].get(di);
           return node.value;
        }else{
            return null;
        }

    }

    public boolean containsKey(K key){
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);

        if(di!=-1){
           return true;
        }else{
            return false;
        }
    }

    public ArrayList<K> keyset() throws Exception{
        ArrayList<K> keys = new ArrayList<>();

        for(int i=0;i<buckets.length;i++){
            for(HMNode node:buckets[i]){
                keys.add(node.key);
            }
        }

        return keys;
    }

    public static void main(String[] args) {
        // Create a new instance of your hashMap
        hashMap<String, Integer> map = new hashMap<>();

        // Adding key-value pairs to the hashMap
        try {
            map.put("apple", 10);
            map.put("banana", 20);
            map.put("orange", 15);
            map.put("grape", 25);
        } catch (Exception e) {
            System.out.println("Exception while adding elements: " + e.getMessage());
        }

        // Getting the value associated with a key
        try {
            System.out.println("Value associated with 'apple': " + map.get("apple"));
            System.out.println("Value associated with 'banana': " + map.get("banana"));
        } catch (Exception e) {
            System.out.println("Exception while getting elements: " + e.getMessage());
        }

        // Checking if the hashMap contains a specific key
        System.out.println("Contains 'apple'? " + map.containsKey("apple"));
        System.out.println("Contains 'mango'? " + map.containsKey("mango"));

        // Retrieving all the keys in the hashMap
        try {
            System.out.println("Keys in the hashMap: " + map.keyset());
        } catch (Exception e) {
            System.out.println("Exception while retrieving keys: " + e.getMessage());
        }
    }

}
