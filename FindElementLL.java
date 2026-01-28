
// class Node {
// int data;
// Node next;

// // construtor
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
// // case 1 - if Head is Empty
// if (head == null) {
// head = newNode;
// return;
// }
// // case 2 - if not Empty
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }
// // Find Element

// public void findElement(int pos) {
// Node first = head;
// Node second = head;

// // step 1 : move the first pointer upto pos
// for (int i = 0; i < pos; i++) {
// if (first == null) {
// System.out.println("Out of Limit");
// return;
// }
// first = first.next;
// }
// // step 2 : move the both pointer upto null
// while (first != null) {
// first = first.next;
// second = second.next;
// }
// System.out.println("the element at the given Pos is " + second.data);
// }
// }

// public class FindElementLL {
// public static void main(String[] args) {
// LinkedList list = new LinkedList();

// list.Insert(10);
// list.Insert(20);
// list.Insert(30);
// list.Insert(40);
// list.Insert(50);
// list.Insert(60);
// list.Insert(70);
// list.Insert(80);

// list.findElement(5);
// }
// }
