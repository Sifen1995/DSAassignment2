package DSAASSIGNMENT;

public class testLinkedListInsert {
    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();
        list.insertAtPos(1, 0);
        list.insertAtPos(2, 1);
        list.insertAtPos(3, 1);
        list.show(); // Output: 1 3 2
    }
}
