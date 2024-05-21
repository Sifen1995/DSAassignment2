package DSAASSIGNMENT;

public class LinkedListD {
    Node head;

    public void deleteAfterNode(Node node) {
        if (node == null || node.next == null) {
            System.out.println("Given node is null noting to delete");
            return;
        }
        Node temp = node.next;
        node.next = temp.next;
        temp.next = null; // Disconnect the node to be deleted
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

