package StacksAnQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        CircularQueue queue2 = new CircularQueue(5);
        // queue.insert(3);
        // queue.insert(6);
        // queue.insert(5);
        // queue.insert(19);
        // queue.insert(1);
        // queue.display();
        // System.out.println(queue.remove());
        // queue.display();
        queue2.insert(3);
        queue2.insert(6);
        queue2.insert(5);
        queue2.insert(18);
        queue2.insert(39);
        queue2.display();
        System.out.println(queue2.remove());
        queue2.insert(133);
        queue2.display();
        System.out.println(queue2.remove());
        queue2.insert(23);
        queue2.display();
    }
}
