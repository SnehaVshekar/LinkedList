package linkedlist;

public class LinkedListCount {

        Node head;

        public void printList() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }

        public int KeepCount()
        {
            Node temp = head;
            int count = 0;
            while(temp!=null)
            {
                temp=temp.next;
                count++;
            }
            return count;
        }

}
