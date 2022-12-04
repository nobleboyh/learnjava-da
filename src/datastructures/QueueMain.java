package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        //Queue is just interface -> Need to use a class that implement it
        //Queue is FIFO
        Queue<String> queue = new LinkedList<>();

        //enqueue: offer()
        queue.offer("Test");
        queue.offer("Chi");
        queue.offer("Hoang");
        System.out.println(queue);

        //dequeue: poll()
        queue.poll();
        System.out.println(queue);

        //And we can peek
        System.out.println(queue.peek());
    }
}
