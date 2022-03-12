package co.edu.unbosque.model;

public class ClaseY {

	private Nodo nodo;
	private Nodo cabeza;

	public ClaseY() {
		this.cabeza = null;
	}

	public void insertarNodos() {
		Nodo a, b, c;

	}

	public void crearNodo(int info) {
		this.nodo = new Nodo();
		this.nodo.setInfo(info);
		this.nodo.setSiguiente(null);
	}

	public void crearLista(int info) {
		crearNodo(info);
		this.cabeza = this.nodo;
	}

	public void insertarNodoFinal(int info) {
		Nodo p = this.cabeza;
		crearNodo(info);
		while (p.getSiguiente() != null)
			p = p.getSiguiente();
		p.setSiguiente(nodo);
	}

	public void insertarNodoInicio(int info) {
		if (listaVacia()) {
			crearLista(info);
		} else {
			crearNodo(info);
			this.nodo.setSiguiente(cabeza);
			this.cabeza = this.nodo;
		}
	}

	public void insertarNodoEntreNodos(int info, int n1, int n2) {
		Nodo p, q = this.cabeza;
		p = buscarInfoLista(n1);
		q = buscarInfoLista(n2);
		crearNodo(info);
		if (p != null && q != null) {
			p.setSiguiente(this.nodo);
			this.nodo.setSiguiente(q);
		}
	}

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}

	public Nodo buscarInfoLista(int info) {
		Nodo p = null;
		if(!listaVacia())
			p = this.cabeza;
		while (p != null && p.getInfo() != info) {
			p = p.getSiguiente();
		}
		return p;
	}

	public Nodo removerNodo(int info) {
		Nodo p = null, q = null;
		if (!listaVacia()) {// lista no es vacia
			p = this.cabeza;
			q = p.getSiguiente();
			if (q == null) {// lista con un solo nodo
				if (p.getInfo() == info) {
					this.cabeza = null;
				}
			} else { // lista con dos nodos
				if (q.getSiguiente() == null) {
					if (p.getInfo() == info) {
						// desconectar p de la lista
					} else {
						if (q.getInfo() == info) {
							// desconectar q de la lista
						}
					}
				}
			}

		}
		// cabeza = p;
		return null;
	}

	public Nodo getNodo() {
		return nodo;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}

	public Nodo getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}

}
