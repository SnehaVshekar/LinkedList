package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedLoopCheck obj4 = new LinkedLoopCheck();

        obj4.head = new Node(300);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);
        Node fifth = new Node(300);

        obj4.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=obj4.head;


        System.out.println();

        obj4.checkLoop();

        boolean b=obj4.detectLoop();
        if (b)
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}