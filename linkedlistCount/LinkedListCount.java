package linkedlist;

public class LinkedListCount {
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

    public int CountNumber(int num){
        int count=0;
        Node temp=head;

        while(temp!=null){
            if(temp.data==num){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
}
