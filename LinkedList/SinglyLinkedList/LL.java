package LinkedList.SinglyLinkedList;

import javax.management.ListenerNotFoundException;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertlast(int val){ // time complexity is constant 
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
     
    public int deletelast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    public Node find(int value){ 
        Node node = head;
        while(node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next; //otherwise keep moving forward
        }
        return null; // not found return null
    }


    public Node get(int index){ // this will give us the refrence pointer to that node
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //questions
public void duplicates(){
    Node node = head;
    while(node.next != null){
        if(node.value == node.next.value){
            node.next = node.next.next;
            size--;
        }
        else{
            node = node.next;
        }
    }
    tail = node;
    tail.next = null;
}

//merge
public static LL merge(LL first, LL second){
    Node f = first.head;
    Node s = second.head;
    LL ans = new LL();
    while(f != null && s!=null){
        if(f.value < s.value){
            ans.insertlast(f.value);
            f = f.next;
        } else{
            ans.insertlast(s.value);
            s = s.next;
        }
    }
    while(f != null){
        ans.insertlast(f.value);
        f = f.next;
    }
    while(s != null){
        ans.insertlast(s.value);
        s = s.next;
    }
    return ans;
}
// seaching for a cycle in a linked list
public boolean hasCycle(Node head) {
    Node fast = head;
    Node slow = head;
    while( fast!= null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            return true;
        } 
    }
    return false;
}
//find length of the cycle
public int lengthCycle(Node head) {
    Node fast = head;
    Node slow = head;
    while( fast!= null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            //calculate the length
            Node temp = slow;
            int length = 0;
            do{
                temp = temp.next;
                length++;
            } while(temp != slow);
            return length;
        } 
    }
    return 0;
}

//find the starting node of the cycle
public Node detectCycle(Node head){
    int length = 0;

    Node fast = head;
    Node slow = head;
    while( fast!= null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            length = lengthCycle(slow);
            break;
        } 
    }
    if(length == 0){
        return null;
    }

    // find the start node;
    Node f = head;
    Node s = head;
    while(length > 0){
        s = s.next;
        length--;
    }
    //keep moving both forward and they will meet at start
    while (f != s){
        f=f.next;
        s=s.next;
    }
    return s;
}

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }
        private int findSquare(int number){
            int ans = 0;
            while(number > 0){
                int rem = number % 10; // GIVES THE LAST DIGIT
                ans += rem * rem;
                number /= 10;
            }
            return ans;
        
        }
    //reversing a linked list
    private void reverse(Node node){
        //base condition
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next); // it will keep calling the next next till it reaches the end and move out ot base condition
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //in place reversal of linked list
     public void reverse(){
        if (size < 2){
            return;
        }
        Node previous = null;
        Node present = head;
        Node next = present.next;
        while(present != null){
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = previous;

     }

// middle of a linked list
     public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
     }
     //reverse between a range
     public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        //skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0;current != null && i < right -  left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        } else{
            head = prev;
        }
        newEnd.next = current;
        return head;

     }
     
     //palindrome linked list
     public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond = reverse(mid);
        ListNode rereverseHead = headsecond;

        //compare both the halves
        while(head != null && headsecond != null){
            if(head.val != headsecond.val){
                break;
            }
            head = head.next;
            headsecond = headsecond.next;
        }

        reverse(rereverseHead);
        if(head == null || headsecond == null){
            return true;
        }
        return false;
     }


     // reorder list
     public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;

        //rearrange
        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //next of tail to null
        if(hf != null){
            hf.next = null;
        }
     }

     // reverse every k nodes; if fewer than k remain, leave that tail unchanged (LeetCode 25)
     public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode current = head;
        ListNode prevBlockTail = null;

        while (true) {
            ListNode t = current;
            for (int n = k - 1; n > 0 && t != null; n--) {
                t = t.next;
            }
            if (t == null) {
                break;
            }

            ListNode last = prevBlockTail;
            ListNode newEnd = current;

            ListNode next = current.next;
            ListNode pre = null;
            for (int i = 0; i < k; i++) {
                current.next = pre;
                pre = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = pre;
            } else {
                head = pre;
            }
            newEnd.next = current;

            if (current == null) {
                break;
            }
            prevBlockTail = newEnd;
        }
        return head;
     }

     //reverse alternate k nodes
     public ListNode reverseAlternativeKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode current = head;
        ListNode prevBlockTail = null;

        while (current != null) {
            ListNode t = current;
            for (int n = k - 1; n > 0 && t != null; n--) {
                t = t.next;
            }
            if (t == null) {
                break;
            }

            ListNode last = prevBlockTail;
            ListNode newEnd = current;

            ListNode next = current.next;
            ListNode pre = null;
            for (int i = 0; i < k; i++) {
                current.next = pre;
                pre = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = pre;
            } else {
                head = pre;
            }
            newEnd.next = current;

            //skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                pre = current;
                current = current.next;
            }
        }
        return head;
     }

     // rotate k times 
     public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next ==  null || k<= 0){
            return head;
        }
        ListNode last = head;
        int length = 1;
        //finding the length of list
        while (last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newlast = head;
        for (int i = 0; i < skip-1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
     }

}
