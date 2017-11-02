package linkedlist;

public class LinkedListReverse {
    Node head;

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public Node Reverse(Node head){
        Node curr = head;
        Node prev =null;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
        return head;
    }
}
