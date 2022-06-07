package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	Grafo g;
	
	public ClaseX() {
		y = new ClaseY();
		g = new Grafo();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato) {
		return dato+20;
	}
	
	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	public Grafo getG() {
		return g;
	}

	public void setG(Grafo g) {
		this.g = g;
	}

	
}
