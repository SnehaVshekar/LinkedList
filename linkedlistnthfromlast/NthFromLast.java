package linkedlist;

public class NthFromLast {

    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void printNthFromLast(int n){
        int len =0;
        Node temp=head;

        //find the length of the linked list
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        //if length is less than the specified length
        if(len<n)return;

        //traversing till the nth node from last node (i.e length-n+1)
        temp =head;
        for(int i=1;i<(len-n+1);i++){
            temp=temp.next;
        }
        System.out.println("the "+n+" element from last is "+temp.data);
    }
}
