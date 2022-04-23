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
	
	public Nodo crearArbol(Nodo izquierda, int info, Nodo derecha) {
		if(ab.arbolVacio())
			ab.crearArbol(izquierda, info, derecha);
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
