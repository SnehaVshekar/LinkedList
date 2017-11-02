package linkedlist;

public class LinkedListNth {
    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public int searchNthNode(int index){
       int count=0;
       Node temp =head;

       //search for the nth node
       while(temp != null){
           if(count==index)
               return temp.data;
           count++;
           temp=temp.next;
       }
       System.out.println("the index exceeds the list index");
       return 0;
    }
}