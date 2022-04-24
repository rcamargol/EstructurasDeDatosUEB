package co.edu.unbosque.model;

public class ArbolBinario {
	
	private Nodo raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	
	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}
	
	public boolean arbolVacio() {
		return this.raiz == null;
	}
	
	public Nodo nuevoArbol(Nodo izquierda, int info, Nodo derecha) {
		return new Nodo(izquierda, info, derecha);
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	
}

