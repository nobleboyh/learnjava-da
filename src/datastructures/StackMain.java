package datastructures;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        //LIFO structure
        Stack<String> stacks = new Stack<>();
        //Push data to stack
        stacks.push("Hoang");
        stacks.push("Chi");
        stacks.push("someone");
        System.out.println(stacks);

        //We only can pop the last push
        String who = stacks.pop();
        System.out.println("Who out? " + who);
        System.out.println("Stack left: " + stacks);

        //Another features
        System.out.println(stacks.peek());
        System.out.println(stacks.search("Chi"));
    }
}
