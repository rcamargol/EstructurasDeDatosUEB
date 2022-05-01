package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	ArbolBinario ab;
	Cola c;

	public ClaseX() {
		y = new ClaseY();
		ab = new ArbolBinario();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato + 20;
	}

	public NodoA crearArbol() {
		NodoA a, a1, a2;
		Pila p = new Pila();
		a1 = ab.nuevoArbol(null, 5, null);
		a2 = ab.nuevoArbol(null, 8, null);
		a = ab.nuevoArbol(a1, 2, a2);
		p.hacerPUSH(a);
		a1 = ab.nuevoArbol(null, 7, null);
		a2 = ab.nuevoArbol(null, 10, null);
		a = ab.nuevoArbol(a1, 6, a2);
		p.hacerPUSH(a);
		a2 = (NodoA) p.hacerPEEK();
		p.hacerPOP();
		a1 = (NodoA) p.hacerPEEK();
		p.hacerPOP();
		a = ab.nuevoArbol(a1, 3, a2);
		return a;
	}

	public NodoA crearABB() {
		int[] valores = { 3, 2, 6, 5, 8, 7, 10 };
		ab = new ArbolBinario();
		for (int i = 0; i < valores.length; i++) {
			ab.insertarArbolABB(valores[i]);
		}
		return ab.getRaiz();
	}

	public ArbolBinario getAb() {
		return ab;
	}

	public void setAb(ArbolBinario ab) {
		this.ab = ab;
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

}
