package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	Lista l;
	
	public ClaseX() {
		y = new ClaseY();
		l = new Lista();
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

	
}
