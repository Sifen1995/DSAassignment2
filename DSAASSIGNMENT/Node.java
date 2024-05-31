package DSAASSIGNMENT;

public class Node {
       private Task task;
        private Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null; // Initially no next node
        }

        // Getter methods
        public Task getTask() {
            return task;
        }

        public Node getNext() {
            return next;
        }

        // Setter method for next
        public void setNext(Node next) {
            this.next = next;
        }
    }

