package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedList obj1 = new LinkedList();
        LinkedListDelete obj2 = new LinkedListDelete();
        LinkedListSearch obj3 = new LinkedListSearch();
        LinkedlistSwap obj4 = new LinkedlistSwap();

        obj4.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);

        obj4.head.next = second;
        second.next = third;

        obj4.printList();
        System.out.println();

        obj4.SwapLinkedList(100,200);

        obj4.printList();

    }
}