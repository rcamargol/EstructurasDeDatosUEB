package co.edu.unbosque.model;

public class Lista {
	
	private Nodo nodo;
	private Nodo cabeza;
	
	public void crearNodo(int info) {}
	public void crearLista(int info) {}
	public void insertarNodoFinal(int info) {}
	public boolean listaVacia() { return true; }
	public Nodo buscarInfoLista(int info) {return null;}
	public void insertarNodoInicio(int info) {}
	public void insertarNodoEntreNodos(int info) {}
	//getters y setters
	public Nodo getNodo() {return nodo;}
	public void setNodo(Nodo nodo) {this.nodo = nodo;}
	public Nodo getCabeza() {return cabeza;}
	public void setCabeza(Nodo cabeza) {this.cabeza = cabeza;}
}
