package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedListCount obj4 = new LinkedListCount();

        obj4.head = new Node(300);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);
        Node fifth = new Node(300);

        obj4.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=fifth;

        obj4.printList();
        System.out.println();

        int cnt= obj4.CountNumber(300);
        System.out.println("Number of times the number appears is "+cnt);
    }
}