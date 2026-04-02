package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL doubly = new DLL();
        doubly.insertFirst(10);
        doubly.insertFirst(76);
        doubly.insertFirst(2);
        doubly.insertFirst(5);
        doubly.insertFirst(11);
        doubly.insertFirst(8);
        doubly.insertLast(99);
        doubly.insert(5, 45);
        doubly.display();
    }
}
