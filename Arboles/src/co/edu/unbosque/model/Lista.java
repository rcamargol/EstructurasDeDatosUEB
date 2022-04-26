package co.edu.unbosque.model;

public class Lista {

	protected NodoL NodoL;
	protected NodoL cabeza;

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}
	public void crearNodo(Object info) {
		this.NodoL = new NodoL();
		this.NodoL.setInfo(info);
		this.NodoL.setSiguiente(null);
	}
	public void crearLista(Object info) {
		crearNodo(info);
		this.cabeza = this.NodoL;
	}
	public void insertarNodoFinal(Object info) {
		if (listaVacia()) {
			crearLista(info);
		} else {
			NodoL p = this.cabeza;
			crearNodo(info);
			while (p.getSiguiente() != null)
				p = p.getSiguiente();
			p.setSiguiente(NodoL);
		}
	}
	public void insertarNodoInicio(Object info) {
		if (listaVacia()) {
			crearLista(info);
		} else {
			crearNodo(info);
			this.NodoL.setSiguiente(cabeza);
			this.cabeza = this.NodoL;
		}
	}
	public NodoL buscarInfoLista(Object info) {
		NodoL p = null;
		if (!listaVacia())
			p = this.cabeza;
		while (p != null && p.getInfo() != info) {
			p = p.getSiguiente();
		}
		return p;
	}
	public void insertarNodoEntreNodos(Object info, Object n1, Object n2) {
		NodoL p, q = this.cabeza;
		p = buscarInfoLista(n1);
		q = buscarInfoLista(n2);
		crearNodo(info);
		if (p != null && q != null) {
			p.setSiguiente(this.NodoL);
			this.NodoL.setSiguiente(q);
		}
	}
	public int removerNodo(Object info) {
		NodoL p, q;
		if (!listaVacia()) { // lista no es vacia
			p = buscarInfoLista(info);
			if (p != null) { // el nodo está en la lista
				if (p == this.cabeza) {// el nodo está en la cabeza
					this.cabeza = p.getSiguiente();
				} else {
					q = this.cabeza;
					while (q.getSiguiente() != p) {
						q = q.getSiguiente();
					}
					q.setSiguiente(p.getSiguiente());
				}
			} else
				return -1;
		}
		return 1;
	}
	public void insertarListaOrdenada(Object info) {
		NodoL p, q;
		boolean encontro = false;
		if (listaVacia()) {// lista está vacia?
			crearLista(info);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?
				if ((int)this.cabeza.getInfo() < (int)info) {
					insertarNodoFinal(info);
				} else {
					insertarNodoInicio(info);
				}
			} else { // dos o más nodos en la lista
				p = null;
				q = this.cabeza;
				while (q != null && !encontro) {
					if ((int)info > (int)q.getInfo()) {
						p = q;
						q = q.getSiguiente();
					} else
						encontro = true;
				}
				if (encontro) { // info es menor que un numero de la lista
					if (p == null) { // el menor esta al inicio
						insertarNodoInicio(info);
					} else {
						insertarNodoEntreNodos(info, p.getInfo(), q.getInfo());
					}
				} else {// el menor está al final
					insertarNodoFinal(info);
				}
			}
		}
	}
	public void insertarListaOrdenada(int info, int modo) {
		NodoL p, q;
		boolean comparacion1, comparacion2, encontro;
		comparacion1 = comparacion2 = encontro = false;

		if (listaVacia()) {// lista está vacia?
			crearLista(info);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?

				if (modo == 1)
					comparacion1 = (int)this.cabeza.getInfo() < info;
				else
					comparacion1 = (int)this.cabeza.getInfo() > info;

				if (comparacion1) {// comparacion1
					insertarNodoFinal(info);
				} else {
					insertarNodoInicio(info);
				}
			} else { // dos o más nodos en la lista
				p = null;
				q = this.cabeza;

				while (q != null && !encontro) {
					if (modo == 1)
						comparacion2 = info > (int)q.getInfo();
					else
						comparacion2 = info < (int)q.getInfo();

					if (comparacion2) {// comparacion2
						p = q;
						q = q.getSiguiente();
					} else
						encontro = true;
				}
				if (encontro) { // info es menor que un numero de la lista
					if (p == null) { // el menor esta al inicio
						insertarNodoInicio(info);
					} else {
						insertarNodoEntreNodos(info, p.getInfo(), q.getInfo());
					}
				} else {// el menor está al final
					insertarNodoFinal(info);
				}
			}
		}
	}
	public void invertirLista() {
		NodoL p, q, aux;
		if (!listaVacia()) {
			p = this.cabeza;
			q = p.getSiguiente();
			p.setSiguiente(null);
			while (q != null) {
				aux = q.getSiguiente();
				q.setSiguiente(p);
				p = q;
				q = aux;
			}
			this.cabeza = p;
		}
	}
	public NodoL invertirListaRecursiva(NodoL p, NodoL q) {
		NodoL aux, r=null;
		// p = this.cabeza;
		//q = p.getSiguiente();
		//p.setSiguiente(null);
		if (q != null) {
			aux = q.getSiguiente();
			q.setSiguiente(p);
			p = q;
			q = aux;
			System.out.println(">>> "+p.getInfo());
			r = invertirListaRecursiva(p,q);
		} 
		else
			return r;
		return null;
	}
	// getters y setters
	public NodoL getNodo() {
		return NodoL;
	}
	public void setNodo(NodoL nodo) {
		this.NodoL = nodo;
	}
	public NodoL getCabeza() {
		return cabeza;
	}
	public void setCabeza(NodoL cabeza) {
		this.cabeza = cabeza;
	}
}
