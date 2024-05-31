package DSAASSIGNMENT;

public class ToDoMain {
       public static void main(String[] args) {
            // Create a new ToDoList
            ToDoList myList = new ToDoList();

            // Add some tasks
            Task task1 = new Task("exersise", "go to gym");
            Task task2 = new Task("travel", "go to Greenland");
            Task task3 = new Task("eat", "go to a restorant");

            myList.addToDo(task1);
            myList.addToDo(task2);
            myList.addToDo(task3);

            // Mark a task as completed
            myList.markToDoAsCompleted("eat");

            // View the updated list
            System.out.println("My To-Do List:");
            myList.viewToDoList();
        }
    }

