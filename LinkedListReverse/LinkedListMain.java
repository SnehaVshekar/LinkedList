package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedListReverse obj4 = new LinkedListReverse();

        obj4.head = new Node(300);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);
        Node fifth = new Node(300);

        obj4.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=fifth;

        obj4.printList(obj4.head);
        System.out.println();

        Node head=obj4.Reverse(obj4.head);
        obj4.printList(head);
    }
}