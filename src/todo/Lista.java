package todo;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	public void showLista() {
		for (int i = 0; i < this.tasks.size(); i++) {
			Task currentTask = this.tasks.get(i);
			System.out.println("Tarea num: " + currentTask.getId());
			System.out.println("Título tarea: " + currentTask.getTitle());
			
			if(currentTask.isComplete()) {
				System.out.println("Tarea completada");
			} else {
				System.out.println("Tarea NO completada");
			}
		}
	}


	
}
