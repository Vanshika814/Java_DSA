package StacksAnQueues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        CustomStack stack2 = new DynamicStack(5);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.push(16);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
