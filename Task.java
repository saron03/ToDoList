package Linkedlist;
public class Task {
	//attributes
	String title, description;
	boolean completed;
	
	//constructor
	Task(String title, String description){
		this.title = title;
		this.description = description;
	}
	
	//methods
	String getTitle() {
		return title;
	}
	String getDescription() {
		return description;
	}
	boolean isCompleted() {
		return completed;
	}
	void markCompleted() {
		completed = true;
	}
}
