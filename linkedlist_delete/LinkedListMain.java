package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedList obj1 = new LinkedList();
        LinkedListDelete obj2 = new LinkedListDelete();

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

        obj1.InsertAtPosition(3);
        System.out.println(" \n ");
        obj1.printList();

        obj2.head = new Node(7);
        Node second1 = new Node(72);
        Node third1 = new Node(300);

        obj2.head.next = second1;
        second1.next = third1;

        System.out.println(" \n ");
        System.out.println("Before deleting");
        obj2.printDeleteList();

        obj2.DeleteKey(300);
        System.out.println(" \n ");
        System.out.println("After deleting");
        obj2.printDeleteList();
        System.out.println(" \n ");

        obj2.DeletePosition(4);
        obj2.printDeleteList();
    }
}