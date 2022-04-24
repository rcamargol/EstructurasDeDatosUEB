package co.edu.unbosque.model;

public class Nodo {
	private Object info;
	private Nodo derecha;
	private Nodo izquierda;
	
	public Nodo(int info) {
		this.info = info;
		this.derecha = null;
		this.izquierda = null;
	}
	
	public Nodo (Nodo izquierda, int info , Nodo derecha) {
		this.info = info;
		this.setIzquierda(izquierda);
		this.setDerecha(derecha);
	}
	
	public Object getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}
	
	
}
