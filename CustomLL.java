
    class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    class LinkedList{
        Node head;

        //insert Method
        public void Insert(int data){
            Node newNode = new Node(data);
            //case 1 - if Head data is Empty
            if(head == null){
                head = newNode; //first value 
                return;
            }
            //case 2 - if not empty
            Node temp = head;
            while(temp.next != null){
                temp = temp.next; //move last value
            }
            temp.next = newNode; //link last node to new node
        }

        //Display method
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public class CustomLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Insert(5);
        list.Insert(10);
        list.Insert(20);
        list.Insert(25);
        list.Insert(35);
        list.Insert(55);
        list.Insert(95);

        list.display();
    }
}
