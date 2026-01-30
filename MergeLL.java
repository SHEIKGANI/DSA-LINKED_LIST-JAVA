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

    public Node merge(Node head1, Node head2) {

        Node temp = new Node(0);
        Node tail = temp;

        // Traverse both lists until one becomes null
        while (head1 != null && head2 != null) {
            // Compare and attach the smaller node to tail.next
            if (head1.data <= head2.data) {
                tail.next = head1; // Attach head1 node
                head1 = head1.next; // Move head1 to next node
            } else {
                tail.next = head2;
                head2 = head2.next;

            }
            tail = tail.next; // Move tail to the newly added node
        }

        // Attach any remaining nodes in head1 or head2
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }

        // Return the head of the merged list (skip the dummy node)
        return temp.next;

    }

    // display method
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}

public class MergeLL {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.Insert(10);
        list1.Insert(30);
        list1.Insert(50);
        list1.Insert(70);

        list2.Insert(20);
        list2.Insert(40);
        list2.Insert(60);
        list2.Insert(80);

        LinkedList result = new LinkedList();

        // Merge the two lists and assign the result to result.head
        result.head = result.merge(list1.head, list2.head);

        result.display();

    }
}
