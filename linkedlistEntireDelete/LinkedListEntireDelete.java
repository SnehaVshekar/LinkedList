package linkedlist;

public class LinkedListEntireDelete {

    Node head;

    public void printList() {
        Node n = head;

        if(head==null){
            System.out.println("List is Empty");
        }
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    void deleteList()
    {
        head = null;
    }
}
