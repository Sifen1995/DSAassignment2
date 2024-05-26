package DSAASSIGNMENT;

public class LLdeleteAtPos {  //delets a node at a given position
    Node head;
    public void deleteAtPosition(int position) {
        // If linked list is empty
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node nextNode = temp.next.next;

        temp.next = nextNode;
    }
    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LLdeleteAtPos linkedList = new LLdeleteAtPos();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        System.out.println("Linked list before deletion:");
        linkedList.show();

        int positionToDelete = 1;
        linkedList.deleteAtPosition(positionToDelete);

        System.out.println("\nLinked list after deletion at position " + positionToDelete + ":");
        linkedList.show();
    }
}

