class Node {

    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // insert method
    public void Insert(int data) {
        Node newNode = new Node(data);
        // case 1 - if head is EMPTY
        if (head == null) {
            head = newNode;
            return;
        }
        // case 2 - if NOT EMPTY
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // LOOP CHECKING
    public Boolean findLoop() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

}

public class LoopDetection {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        list.Insert(40);
        list.Insert(50);
        list.Insert(60);
        list.Insert(70);
        list.Insert(80);

        list.head.next.next.next.next.next = list.head.next;

        if (list.findLoop()) {
            System.out.println("YES, LOOP DETECTED");
        } else {
            System.out.println("NO LOOP");
        }

    }
}