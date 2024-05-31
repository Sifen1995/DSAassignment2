package DSAASSIGNMENT;
public class ToDoList {
    private Node head;

        public ToDoList() {
            this.head = null; // Initially empty list
        }

        public void addToDo(Task task) {
            Node newNode = new Node(task);
            if (head == null) {
                // If the list is empty, set the new node as the head
                head = newNode;
            } else {
                // Traverse the list to find the last node
                Node current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                // Set the new node as the next node of the last node
                current.setNext(newNode);
            }

        }

        public void markToDoAsCompleted(String title) {
            Node current = head;
            while (current != null) {
                if (current.getTask().getTitle().equals(title)) {
                    current.getTask().markCompleted();
                    break; // Task found, exit loop
                }
                current = current.getNext();
            }
        }

        public void viewToDoList() {
            Node current = head;
            while (current != null) {
                Task task = current.getTask();
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Completed: " + task.isCompleted());
                System.out.println(); // Add a newline for readability
                current = current.getNext();
            }

        }
    }
