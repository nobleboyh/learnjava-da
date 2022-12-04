package datastructures;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
    public static void main(String[] args) {
        //Each node contains: data + address
        //Can be in any gap in memory

        //Insertion and Deletion: O(1)
        //Search: O(n)
        //
        LinkedList<String> linkedList = new LinkedList<>();

        //Could be used as Queue or Stack
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");

        System.out.println(linkedList);

        //Insert
        linkedList.add(2, "D");
        System.out.println(linkedList);

        //How to find next?
        ListIterator<String> iterator = linkedList.listIterator();
        System.out.println(iterator.next());
        iterator.set("Test");
        System.out.println(linkedList);

    }
}
