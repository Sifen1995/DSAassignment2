package DSAASSIGNMENT;

public class LLSearch {
    Node head;
    public boolean searchNode(int value) {   //search by value
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
         LLSearch linkedList = new LLSearch();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        System.out.println("Linked list:");
        linkedList.show();

        int searchValue = 2;
        boolean isNodeFound = linkedList.searchNode(searchValue);

        if (isNodeFound) {
            System.out.println("\nNode with value " + searchValue + " found in the linked list.");
        } else {
            System.out.println("\nNode with value " + searchValue + " not found in the linked list.");
        }
    }
}

