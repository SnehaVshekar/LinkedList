package linkedlist;

public class LinkedlistSwap {
    Node head;

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
}

public void SwapLinkedList(int x, int y){


    // Nothing to do if x and y are same
    if (x == y) return;

    // Search for x (keep track of prevX and CurrX)
    Node prevX = null, currX = head;
    while (currX != null && currX.data != x)
    {
        prevX = currX;
        currX = currX.next;
    }

    // Search for y (keep track of prevY and currY)
    Node prevY = null, currY = head;
    while (currY != null && currY.data != y)
    {
        prevY = currY;
        currY = currY.next;
    }

    // If either x or y is not present, nothing to do
    if (currX == null || currY == null)
        return;

    // If x is not head of linked list
    if (prevX != null)
        prevX.next = currY;
    else //make y the new head
        head = currY;

    // If y is not head of linked list
    if (prevY != null)
        prevY.next = currX;
    else // make x the new head
        head = currX;

    // Swap next pointers
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
}

}
