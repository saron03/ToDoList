package Linkedlist;
public class ToDoList {
	//attributes
	Node head;
	
	ToDoList(){
		head = null;
	}
	//methods
	void addToDo(Task task) {
		Node newNode = new Node(task);
		if(head == null ) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current= current.next;
			}
			current.next = newNode;
		}
	}
	
	void markToDoAsCompleted(String title){
		Node current = head;
		while(current != null) {
			if(current.task.getTitle().equals(title)) {
				current.task.markCompleted();
				return;
			}
			current = current.next;
		}
		System.out.println("Task not found in the list");
	}
	
	void viewToDoList() {
		Node current = head;
		System.out.println("Task List:\n");
		while(current != null) {
			System.out.println("Title :" + current.task.title + "  \nDescription: " + current.task.description + "  \nCompleted?: " +  current.task.completed);
			System.out.println();
			current = current.next;
		}
	}
	
	//IMPLEMENTATION
	public static void main(String[] args) {
		ToDoList taskList = new ToDoList();
		
		taskList.addToDo( new Task("Task1", "water the plants"));
		taskList.addToDo(new Task("Task2", "do assignments"));
		taskList.addToDo(new Task("Task 3", "clean your room"));
		
		taskList.markToDoAsCompleted("Task2");
		
		taskList.viewToDoList();
	}
}
