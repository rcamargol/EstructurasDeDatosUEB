package co.edu.unbosque.model;

public class ArbolBinario {
	
	private Nodo raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	
	public Nodo crearArbol(int info) {
		this.raiz = new Nodo(info);
		return raiz;
	}
	
	boolean arbolVacio() {
		return this.raiz == null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	
}

