package co.edu.unbosque.model;

public class VerticeAdy {

	String nombre;
	int numVertice;
	Lista lad; // lista de adyacencia
	// constructor de la clase

	public VerticeAdy(String x) {
		nombre = x;
		numVertice = -1;
		lad = new Lista();
	}

}
