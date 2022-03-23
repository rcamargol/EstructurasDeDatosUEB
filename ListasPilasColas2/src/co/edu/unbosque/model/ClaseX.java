package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	Lista l;
	Pila p;
	Cola c;
	
	public ClaseX() {
		y = new ClaseY();
		l = new Lista();
		p = new Pila();
		c = new Cola();
	}

	
	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}


	public Lista getL() {
		return l;
	}


	public void setL(Lista l) {
		this.l = l;
	}


	public Pila getP() {
		return p;
	}


	public void setP(Pila p) {
		this.p = p;
	}


	public Cola getC() {
		return c;
	}


	public void setC(Cola c) {
		this.c = c;
	}

	
}
