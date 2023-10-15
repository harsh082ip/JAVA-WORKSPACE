// package Stacks and Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class built_in_examples {
    public static void main(String[] args) {
        // Stacks
        System.out.println("-----Stacks----");
        Stack<Integer> stack = new Stack<>();
        stack.add(6);
        stack.add(16);
        stack.add(87);
        stack.add(19);
        stack.add(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println("-----Queues----");
        // Queues 
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(88);
        queue.add(97);
        queue.add(14);
        queue.add(34);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
