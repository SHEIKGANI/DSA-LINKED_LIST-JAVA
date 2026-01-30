// class Node {
// int data;
// Node next;

// // constructor
// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class LinkedList {
// Node head;

// // insert method
// public void Insert(int data) {
// Node newNode = new Node(data);
// // case 1 - head is empty
// if (head == null) {
// head = newNode;
// return;
// }
// // case 2 - if not empty
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }

// // finding duplicate
// public void FindDuplicate() {
// Node current = head;

// while (current != null && current.next != null) {
// if (current.data == current.next.data) {
// current.next = current.next.next;
// } else {
// current = current.next;
// }
// }
// }
// // display method

// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }

// public class DuplicateSorted {
// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.Insert(10);
// list.Insert(10);
// list.Insert(20);
// list.Insert(30);
// // list.Insert(40);
// // list.Insert(40);
// list.Insert(50);
// list.Insert(60);
// list.Insert(60);

// list.FindDuplicate();
// list.display();
// }
// }
// }