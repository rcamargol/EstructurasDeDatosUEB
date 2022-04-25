package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	ArbolBinario ab;
	
	public ClaseX() {
		y = new ClaseY();
		ab = new ArbolBinario();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
	public Nodo crearArbol() {
		Nodo a, a1, a2;
		Pila p = new Pila();
		a1 = ab.nuevoArbol(null, 5, null);
		a2 = ab.nuevoArbol(null, 8, null);
		a = ab.nuevoArbol(a1, 2, a2);
		p.hacerPUSH(a);
		a1 = ab.nuevoArbol(null, 7, null);
		a2 = ab.nuevoArbol(null, 10, null);
		a = ab.nuevoArbol(a1, 6, a2);
		p.hacerPUSH(a);
		a2 = (Nodo)p.hacerPEEK();
		p.hacerPOP();
		a1 = (Nodo)p.hacerPEEK();
		p.hacerPOP();
		a = ab.nuevoArbol(a1, 3, a2);
		return a;
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
