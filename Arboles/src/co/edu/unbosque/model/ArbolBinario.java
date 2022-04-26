package co.edu.unbosque.model;

public class ArbolBinario {
	
	private NodoA raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	
	public ArbolBinario(NodoA raiz) {
		this.raiz = raiz;
	}
	
	public boolean arbolVacio() {
		return this.raiz == null;
	}
	
	public NodoA nuevoArbol(NodoA izquierda, int info, NodoA derecha) {
		return new NodoA(izquierda, info, derecha);
	}

	public NodoA getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoA raiz) {
		this.raiz = raiz;
	}
	
	
}

