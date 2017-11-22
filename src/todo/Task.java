package todo;

public class Task {
	
	private int id;
	private String title;
	private boolean completed;
	
	public Task(int id, String title) {
		this.id = id;
		this.title = title;
		this.completed = false;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean isComplete() {
		return this.completed;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setComplete() {
		this.completed = true;
	}
	
	public void setIncomplete() {
		this.completed = false;
	}
	

}
