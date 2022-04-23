package co.edu.unbosque.model;

public class ArbolBinario {
	
	private Nodo raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	
	public boolean arbolVacio() {
		return this.raiz == null;
	}
	public Nodo crearArbol(Nodo izquierda, int info, Nodo derecha) {
		Nodo n = new Nodo(izquierda,info,derecha);
		this.raiz = n;
		return this.raiz;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	
}

