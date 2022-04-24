package co.edu.unbosque.model;

public class Lista {

	protected Nodol nodol;
	protected Nodol cabeza;

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}

	public void crearNodo(Object info) {
		this.nodol = new Nodol();
		this.nodol.setInfo((int)info);
		this.nodol.setSiguiente(null);
	}

	public void crearLista(Object info) {
		crearNodo(info);
		this.cabeza = this.nodol;
	}

	public void insertarNodoFinal(int info) {
		if (listaVacia()) {
			crearLista(info);
		} else {
			Nodol p = this.cabeza;
			crearNodo(info);
			while (p.getSiguiente() != null)
				p = p.getSiguiente();
			p.setSiguiente(nodol);
		}
	}

	public void insertarNodoInicio(Object info) {
		if (listaVacia()) {
			crearLista(info);
		} else {
			crearNodo(info);
			this.nodol.setSiguiente(cabeza);
			this.cabeza = this.nodol;
		}
	}

	public Nodol buscarInfoLista(Object info) {
		Nodol p = null;
		if (!listaVacia())
			p = this.cabeza;
		while (p != null && (int)p.getInfo() != (int)info) {
			p = p.getSiguiente();
		}
		return p;
	}

	public void insertarNodoEntreNodos(Object info, Object n1, Object n2) {
		Nodol p, q = this.cabeza;
		p = buscarInfoLista(n1);
		q = buscarInfoLista(n2);
		crearNodo(info);
		if (p != null && q != null) {
			p.setSiguiente(this.nodol);
			this.nodol.setSiguiente(q);
		}
	}

	public int removerNodo(Object info) {
		Nodol p, q;
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

	public void insertarListaOrdenada(int info) {
		Nodol p, q;
		boolean encontro = false;
		if (listaVacia()) {// lista está vacia?
			crearLista(info);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?
				if ((int)this.cabeza.getInfo() < info) {
					insertarNodoFinal(info);
				} else {
					insertarNodoInicio(info);
				}
			} else { // dos o más nodos en la lista
				p = null;
				q = this.cabeza;
				while (q != null && !encontro) {
					if (info > (int)q.getInfo()) {
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
		Nodol p, q;
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
		Nodol p, q, aux;
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

	public Nodol invertirListaRecursiva(Nodol p, Nodol q) {
		Nodol aux, r=null;
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
	public Nodol getNodo() {
		return nodol;
	}

	public void setNodo(Nodol nodo) {
		this.nodol = nodo;
	}

	public Nodol getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodol cabeza) {
		this.cabeza = cabeza;
	}
}
