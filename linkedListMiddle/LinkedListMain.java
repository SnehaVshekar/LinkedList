package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedListMiddle obj4 = new LinkedListMiddle();

        obj4.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);

        obj4.head.next = second;
        second.next = third;
        third.next=fourth;

        obj4.printList();
        System.out.println();

        obj4.MiddleElement();

    }
}