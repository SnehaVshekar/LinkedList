package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedList obj1 = new LinkedList();

        obj1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        obj1.head.next = second;
        second.next = third;

        obj1.printList();

        obj1.InsertAtFront(18);
        System.out.println(" \n ");
        obj1.printList();

        obj1.InsertAtEnd(29);
        System.out.println(" \n ");
        obj1.printList();

        obj1.InsertAtPosition(1);
        System.out.println(" \n ");
        obj1.printList();
    }
}