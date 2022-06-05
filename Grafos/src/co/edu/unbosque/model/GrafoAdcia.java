package co.edu.unbosque.model;

public class GrafoAdcia {
	int numVerts;
	static int maxVerts = 20;
	VerticeAdy[] tablAdc;

	public GrafoAdcia(int mx) {
		tablAdc = new VerticeAdy[mx];
		numVerts = 0;
		maxVerts = mx;
	}
	
}
