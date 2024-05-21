package DSAASSIGNMENT;

public class testLinkedListD {
    public static void main(String[] args) {
        LinkedListD list = new LinkedListD();

        // Creating nodes for demonstration
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 =new Node(5);
        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println("Before deletion:");
        list.show(); // Output: 1 2 3

        list.deleteAfterNode(node2); // Delete the node after node1

        System.out.println("After deletion:");
        list.show(); // Output: 1 3
    }
}
