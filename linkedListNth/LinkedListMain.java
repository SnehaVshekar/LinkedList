package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedListNth obj4 = new LinkedListNth();

        obj4.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);

        obj4.head.next = second;
        second.next = third;

        obj4.printList();
        System.out.println();

        int index=obj4.searchNthNode(2);

        System.out.println("data at index is "+index);
    }
}