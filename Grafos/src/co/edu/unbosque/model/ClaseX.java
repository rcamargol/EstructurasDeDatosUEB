package co.edu.unbosque.model;

public class ClaseX {
	ClaseY y;
	Grafo g;
	GrafoMatriz gm;
	
	public ClaseX() {
		y = new ClaseY();
		g = new Grafo();
		gm = new GrafoMatriz(4);
	}
	
	public void llenarGrafo() {
		gm.nuevoVertice("A");
		gm.nuevoVertice("B");
		gm.nuevoVertice("C");
		gm.nuevoVertice("D");
		try {
			gm.nuevoArco("A", "B");
			gm.nuevoArco("A", "C");
			gm.nuevoArco("B", "C");
			gm.nuevoArco("C", "D");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

	public GrafoMatriz getGm() {
		return gm;
	}

	public void setGm(GrafoMatriz gm) {
		this.gm = gm;
	}

	
}
