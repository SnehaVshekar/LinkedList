package linkedlist;

public class LinkedListMain {


    public static void main(String[] args) {

        LinkedList obj1 = new LinkedList();
        LinkedListDelete obj2 = new LinkedListDelete();
        LinkedListSearch obj3 = new LinkedListSearch();

        obj3.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);

        obj3.head.next = second;
        second.next = third;

        obj3.printList();
        System.out.println();
        boolean cnt = obj3.SearchList(obj3.head,3000);
        if(cnt==true){
            System.out.println("Key found");
        }
        else
            System.out.println("Key not found");

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

        System.out.println("After deleting");
        obj2.printDeleteList();
        System.out.println(" \n ");

        obj2.DeletePosition(4);
        obj2.printDeleteList();
    }
}