package linkedlist;

class LinkedList {

    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void InsertAtFront(int d){
        Node n1 = new Node(d);
        // if list is empty -> new node becomes head
        if (head == null)
        {
            head = n1;
            return;
        }
        else {
            n1.next = head;
            head = n1;
        }
    }

    public void InsertAtEnd(int d){
        Node n2 = new Node(d);
        //if empty list then new node becomes head
        if (head == null)
        {
            head = n2;
            return;
        }
        else
        {
            Node temp = head;

            while(temp.next!=null)
            temp=temp.next;

            temp.next = n2;
            n2.next = null;
            return;
        }
    }

    public void InsertAtPosition(int p)
    {
        Node temp = head;
        Node prev = temp;

        Node n3 = new Node(300);

        //if inserting at empty list
        if (head == null)
        {
            head = n3;
            return;
        }
        //if position is first node (new node becomes head)
        if(p==1){
            n3.next=head;
            head=n3;
            return;
        }
        int pos = 1;
        while(pos!=p){
            prev=temp;
            temp=temp.next;
            pos++;
        }
        n3.next=temp;
        prev.next=n3;
        return;
    }
}

