package linkedlist;

public class LinkedListSearch {

        Node head;

        public void printList() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }

        public boolean SearchList(Node head,int key)
        {
            Node temp = head;
            while(temp!=null){
                if(temp.data==key){return true;}
                temp=temp.next;
            }
            return false;
        }

}
