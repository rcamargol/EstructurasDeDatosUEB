package co.edu.unbosque.model;

public class Lista {

	protected Nodo nodo;
	protected Nodo cabeza;

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
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
		if (listaVacia()) {
			crearLista(info);
		} else {
			Nodo p = this.cabeza;
			crearNodo(info);
			while (p.getSiguiente() != null)
				p = p.getSiguiente();
			p.setSiguiente(nodo);
		}
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

	public Nodo buscarInfoLista(int info) {
		Nodo p = null;
		if (!listaVacia())
			p = this.cabeza;
		while (p != null && p.getInfo() != info) {
			p = p.getSiguiente();
		}
		return p;
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

	public int removerNodo(int info) {
		Nodo p, q;
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
		Nodo p, q;
		boolean encontro = false;
		if (listaVacia()) {// lista está vacia?
			crearLista(info);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?
				if (this.cabeza.getInfo() < info) {
					insertarNodoFinal(info);
				} else {
					insertarNodoInicio(info);
				}
			} else { // dos o más nodos en la lista
				p = null;
				q = this.cabeza;
				while (q != null && !encontro) {
					if (info > q.getInfo()) {
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
		Nodo p, q;
		boolean comparacion1, comparacion2, encontro;
		comparacion1 = comparacion2 = encontro = false;

		if (listaVacia()) {// lista está vacia?
			crearLista(info);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?

				if (modo == 1)
					comparacion1 = this.cabeza.getInfo() < info;
				else
					comparacion1 = this.cabeza.getInfo() > info;

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
						comparacion2 = info > q.getInfo();
					else
						comparacion2 = info < q.getInfo();

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
		Nodo p, q, aux;
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

	public void invertirListaRec() {
		this.cabeza = invertirListaRecursiva(this.cabeza, this.cabeza.getSiguiente());
		System.out.println("invertirListaRec()");
	}

	public Nodo invertirListaRecursiva(Nodo p, Nodo q) {
		Nodo aux, r = null;
		//q = p.getSiguiente();
		if (q != null) {
			aux = q.getSiguiente();
			q.setSiguiente(p);
			p = q;
			q = aux;
			System.out.println(">>> " + p.getInfo());
			r = invertirListaRecursiva(p,q);
		} else
			r = p;
		return r;
	}

	public int sumarInfoRec(Nodo nodo) {
		int suma = 0;
		if (nodo != null) {
			suma = nodo.getInfo() + sumarInfoRec(nodo.getSiguiente());
			// System.out.println("Suma:"+ suma);
		}
		return suma;
	}

	public int contarNodosRec(Nodo nodo) {
		int suma = 1;
		if (nodo == null)
			suma = 0;
		else if (nodo.getSiguiente() != null) {
			suma += contarNodosRec(nodo.getSiguiente());
			System.out.println("Cuenta:" + suma);
		}
		return suma;
	}
	
	public int procesoRecursivo(Nodo nodo) {
		int valor = 1;
		if (nodo == null)
			valor = 0;
		else if (nodo.getSiguiente() != null) {
			valor += procesoRecursivo(nodo.getSiguiente());
		}
		return valor;
	}	
	

	// getters y setters
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
