package StacksAnQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
    public static void main(String[] args) {
        //-------- stack-------
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(12);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //-------- queue-------
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());


        //--------dequeue-------
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(8);
        deque.add(3);
        deque.add(1);
        deque.add(9);
        deque.addLast(0);
        deque.removeFirst();
        //etc.
    }
}
