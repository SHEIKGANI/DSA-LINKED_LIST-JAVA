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

    public boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;

        // STEP 1: Finding the Middle
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse the 2nd part
        Node second = reverse(slow);

        // STEP 3: Compare both the parts
        Node firstPart = head;
        Node secondPart = second;
        while (secondPart != null) {

            if (firstPart.data != secondPart.data)
                return false;
            firstPart = firstPart.next;
            secondPart = secondPart.next;
        }
        return true;
    }

    private Node reverse(Node head) {

        Node curr = head;
        Node prev = null;

        while (curr != null) {

            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;

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

public class PalindromeLL {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        list.Insert(20);
        list.Insert(10);

        if (list.isPalindrome()) {
            System.out.println("Yes, LL is a Palindrome");
        } else {
            System.out.println("No, LL is NOT a Palindrome");
        }

        // list.display();

    }
}