package datastructures;

import java.util.Hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        //Use hash to choose where to store data
        //Search, Delete, Insert: O(1)
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(10,"Hoang");
        hashtable.put(20,"Chi");

        System.out.println(hashtable.get(10));
    }
}
