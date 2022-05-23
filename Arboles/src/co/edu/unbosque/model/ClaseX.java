package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	ArbolBinario ab;
	ArbolB aB;
	Cola c;

	public ClaseX() {
		y = new ClaseY();
		ab = new ArbolBinario();
		aB = new ArbolB();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato + 20;
	}

	public NodoA crearArbol() {
		NodoA a, b, a1, a2;
		Pila p = new Pila();
		a1 = ab.nuevoArbol(null, 4, null);
		a2 = ab.nuevoArbol(null, 7, null);
		a = ab.nuevoArbol(a1, 6, a2);
		p.hacerPUSH(a);
		a1 = ab.nuevoArbol(null, 13, null);
		a2 = null;
		a = ab.nuevoArbol(a1, 14, a2);
		p.hacerPUSH(a);
		a2 = (NodoA) p.hacerPEEK();
		p.hacerPOP();
		b = ab.nuevoArbol(null, 10, a2);
		
		a2 = (NodoA) p.hacerPEEK();
		p.hacerPOP();
		a1 = ab.nuevoArbol(null, 1, null);
		a = ab.nuevoArbol(a1, 3, a2);

		a1 = ab.nuevoArbol(a, 8, b);
		ab.setRaiz(a1);
		return ab.getRaiz();
	}

	public NodoA crearABB() {
		int[] valores = { 10, 5, 1, 8, 20, 15, 30};
		ab = new ArbolBinario();
		for (int i = 0; i < valores.length; i++) {
			ab.insertarArbolABB(valores[i]);
		}
		return ab.getRaiz();
	}
	
	public void crearArbolB() {
		Pagina p,q,r;
		//int
		//p.setInfo();
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
