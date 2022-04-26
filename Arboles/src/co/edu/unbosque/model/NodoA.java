package co.edu.unbosque.model;

public class NodoA {
	private Object info;
	private NodoA derecha;
	private NodoA izquierda;
	
	public NodoA(Object info) {
		this.info = info;
		this.derecha = null;
		this.izquierda = null;
	}
	
	public NodoA (NodoA izquierda, Object info , NodoA derecha) {
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
	public NodoA getDerecha() {
		return derecha;
	}
	public void setDerecha(NodoA derecha) {
		this.derecha = derecha;
	}
	public NodoA getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(NodoA izquierda) {
		this.izquierda = izquierda;
	}
	
}
