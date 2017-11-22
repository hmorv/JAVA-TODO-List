package todo;

public class Todo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista miLista = new Lista();
		
		Task t1 = new Task(1, "Limpiar el coche");
		Task t2 = new Task(2, "Limpiar el perro");
		Task t3 = new Task(3, "Limpiar el gato");
		
		t3.setComplete();
		
		miLista.addTask(t1);
		miLista.addTask(t2);
		miLista.addTask(t3);
		
		miLista.showLista();
	}

}
