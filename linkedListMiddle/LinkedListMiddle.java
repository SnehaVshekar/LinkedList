package linkedlist;

public class LinkedListMiddle {
    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void MiddleElement(){
        Node ptr1 =head;
        Node ptr2 =head;

        if(head!=null){
            while(ptr2 !=null && ptr2.next!=null){
               ptr1=ptr1.next;
               ptr2=ptr2.next.next;
            }
            System.out.println("Middle element is "+ptr1.data);
        }

    }
}

