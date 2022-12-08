package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        /*
        * Vector is Dynamic Array. But synchronized. thread-safe.
        * */
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        int a = vector.get(1);
        /*
         * Array list is Dynamic Array. Everything is same w Vector. not synchronized, not thread-safe. but faster.
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2,3);
        int b = arrayList.get(2);


        /*
         * LinkedList is Linked List. Fast insertion, deletion.
         */
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1,2);

    }
}
