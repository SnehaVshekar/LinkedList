package linkedlist;

public class LinkedListDelete {
    Node head;

    public void printDeleteList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void DeleteKey(int d){
        int key = d;
        Node curr = head;
        Node prev = null;

        while(curr!=null && key != curr.data){
            prev=curr;
            curr=curr.next;
        }
        if (curr == null) {
            return;
        }

        prev.next=curr.next;
        return;
    }


    public void DeletePosition(int pos) {
        int p = pos;

        Node curr = head;
        Node prev = curr;

        //to delete head
        if (p == 1) {
            head = head.next;
            return;
        }

        int i = 1;
        // to delete anything other than head
        while (curr != null && i != p) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (curr == null || curr.next == null) {
            System.out.println("Position exceeds the length of the linked list");
            return;
        }
        prev.next = curr.next;
    }
    }

