package DSAASSIGNMENT;

public class LinkedListInsert {
    Node head;

    public void insertAtPos(int value, int pos) {
        Node newNode = new Node(value);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Position is out of range");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
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


