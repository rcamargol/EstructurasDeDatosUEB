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
		// System.out.println("raiz:" + this.raiz.getInfo() + "-- valor ABB:" +
		// nuevo.getInfo());
	}

	public NodoA buscarArbolABB(Object info) {
		NodoA valor = null;
		boolean encontro = false;
		NodoA p = this.raiz;
		while (p != null && !encontro) {
			if ((int) p.getInfo() == (int) info) {
				valor = p;
				encontro = true;
			} else {
				p = (int) p.getInfo() > (int) info ? p.getIzquierda() : p.getDerecha();
			}
		}
		return valor;
	}

	/*
	 * p: apuntador del nodo a retirar q: apuntador al nodo padre de p
	 */
	private void borrarNodoArbolABB(NodoA p, NodoA q) {
		NodoA r, t, s;
		if (p.getIzquierda() == null)
			r = p.getDerecha();
		else {
			s = p;
			r = p.getDerecha();
			t = r.getDerecha();
			while (t != null) {
				s = r;
				r = t;
				t = t.getIzquierda();
			}
			if (p != s) {
				s.setIzquierda(r.getDerecha());
				r.setDerecha(p.getDerecha());
			}
			r.setIzquierda(p.getIzquierda());
		}
		if (q == null)
			this.raiz = r;
		else if (p == q.getIzquierda())
			q.setIzquierda(r);
		else
			q.setDerecha(r);
	}

	public NodoA borrarNodoArbolABB(Object info) {
		NodoA p, q;
		p = buscarArbolABB(info);
		if (p != null) {
			q = buscarPadre(p);
			borrarNodoArbolABB(p, q);
		}
		return null;
	}

	public NodoA buscarPadre(NodoA q) {
		Cola cola = null;
		NodoA p = this.raiz;
		boolean encontro = false;
		if (p != null) {
			cola = new Cola();
			cola.encolar(p);
		}
		while (!cola.colaVacia() && !encontro) {
			p = (NodoA) cola.getElementoFrente();
			cola.decolar();
			if (p.getDerecha() == q || p.getIzquierda() == q)
				encontro = true;
			else if (p.getIzquierda() != null) {
				cola.encolar(p.getIzquierda());
			}
			if (p.getDerecha() != null) {
				cola.encolar(p.getDerecha());
			}
		}
		if (encontro)
			return p;
		else
			return null;
	}

	public NodoA getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoA raiz) {
		this.raiz = raiz;
	}

}
