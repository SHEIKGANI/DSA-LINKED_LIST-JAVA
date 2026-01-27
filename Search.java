
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

    // insert Method
    public void Insert(int data) {
        Node newNode = new Node(data);
        // case 1 - if Head data is Empty
        if (head == null) {
            head = newNode; // first value
            return;
        }
        // case 2 - if not empty
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; // move last value
        }
        temp.next = newNode; // link last node to new node
    }

    // Display method
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Search element
    public Boolean Found(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at index " + index);
                return true;
            }

            temp = temp.next;
            index++;
        }

        System.out.println("Not Found ");
        return false;
    }

    // LENGTH OF LINKED LIST

    public void LENGTH() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("The length is " + count);
    }

    // MIDDLE OF THE ELEMENT
    public void Middle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The Middle element is " + slow.data);
    }
}

public class Search {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Insert(10);
        list.Insert(20);
        list.Insert(25);
        list.Insert(35);
        list.Insert(55);
        list.Insert(95);

        list.Found(20);

        list.Middle();
        list.display();

    }
}
