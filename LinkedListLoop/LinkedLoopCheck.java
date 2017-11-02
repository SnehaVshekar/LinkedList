package linkedlist;

import java.util.HashSet;

public class LinkedLoopCheck {
    Node head;

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    //By using Floyd's cycle finding algorithm
    //Traverse linked list using two pointers.  Move one pointer by one and other pointer by two.
    // If these pointers meet at some node then there is a loop.
    // If pointers do not meet then linked list doesn’t have loop.

    public int checkLoop() {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Loop exists");
                return 1;
            }
        }
        System.out.println("There is no loop");
        return 0;
    }

    // detecting loop in a linked list using hashset

    public boolean detectLoop() {
        HashSet<Node> h = new HashSet<Node>();
        Node temp = head;
        while (temp != null) {
            //checks if hashset already contains the address of the node
            if (h.contains(temp)) {
                return true;
            } else {
                //if no then adds the address to the hash-set
                h.add(temp);
                temp = temp.next;
            }

        }
        return false;
    }
}

