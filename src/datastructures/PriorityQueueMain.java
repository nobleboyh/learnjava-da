package datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        //FIFO but with the highest priority first
        Queue<Double> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3.0);
        priorityQueue.offer(1.0);
        priorityQueue.offer(2.0);
        System.out.println(priorityQueue);

        priorityQueue.poll();
        priorityQueue.offer(2.5);

        System.out.println(priorityQueue);
    }
}
