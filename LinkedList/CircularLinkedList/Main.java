package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(2);
        list.insert(7);
        list.insert(1);
        list.insert(10);
        list.display();
        list.delete(7);
        list.display();

    }
}
