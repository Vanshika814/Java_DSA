package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // LL linkedlist = new LL();
        // linkedlist.insertFirst(7);
        // linkedlist.insertFirst(7);
        // linkedlist.insertFirst(2);
        // linkedlist.insertFirst(10);
        // linkedlist.insertFirst(10);
        // linkedlist.insertFirst(1);
        // linkedlist.insertFirst(1);
        // linkedlist.insertFirst(15);
        // linkedlist.insertlast(98);
        // linkedlist.insert(9, 3);
        // // System.out.println(linkedlist.deleteFirst());
        // // linkedlist.display();
        // // System.out.println(linkedlist.deletelast());
        // // linkedlist.display();
        // System.out.println(linkedlist.delete(3));
        // linkedlist.display();
        // linkedlist.insertRec(88, 3);
        // linkedlist.display();
        // linkedlist.duplicates();
        // linkedlist.display();

        LL first = new LL();
        LL second = new LL();
        
        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LL ans= LL.merge(first, second);
        ans.display();
    }
}
