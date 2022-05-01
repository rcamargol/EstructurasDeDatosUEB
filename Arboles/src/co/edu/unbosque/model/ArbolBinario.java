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

	public NodoA nuevoArbol(NodoA izquierda, Object info, NodoA derecha) {
		return new NodoA(izquierda, info, derecha);
	}

	public void insertarArbolABB(Object info) {
		NodoA nuevo = nuevoArbol(null, info, null);
		NodoA actual = this.raiz;
		NodoA anterior = null;
		while (actual != null) {
			anterior = actual;
			actual = (int) actual.getInfo() > (int) info ? actual.getIzquierda() : actual.getDerecha();
		}
		if (anterior == null) // es nuevo el primer nodo?
			this.raiz = nuevo; // apunta raiz al primer nodo - nuevo
		else {// tiene, al menos un nodo
			if ((int) anterior.getInfo() > (int) info) //
				anterior.setIzquierda(nuevo);
			else
				anterior.setDerecha(nuevo);
		}
		//System.out.println("raiz:" + this.raiz.getInfo() + "-- valor ABB:" + nuevo.getInfo());
	}
	
	public NodoA buscarArbolABB(Object info) {
		NodoA valor = null;
		boolean encontro = false;
		NodoA p = this.raiz;
		while (p != null && !encontro) {
			if((int) p.getInfo() == (int)info) {
				valor = p;
				encontro = true;
			}
			else {
				p = (int) p.getInfo() > (int) info ? p.getIzquierda() : p.getDerecha();
			}
		}
		return valor;
	}

	public NodoA getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoA raiz) {
		this.raiz = raiz;
	}

}
