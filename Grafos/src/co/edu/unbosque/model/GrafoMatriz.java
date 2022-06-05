package co.edu.unbosque.model;

public class GrafoMatriz {
	private int numeroVertices; //numero de vertices que tiene el grafo
	private static int MaxVertices = 20;
	private Vertice[] vertices; //arreglo de vertices que tiene el grafo
	private int[][] matrizAdy; //matriz de adyacencia 

	public GrafoMatriz() {
		this(MaxVertices);
	}

	public GrafoMatriz(int mx) {
		this.matrizAdy = new int[mx][mx];
		this.vertices = new Vertice[mx];
		for (int i = 0; i < mx; i++)
			for (int j = 0; i < mx; i++)
				this.matrizAdy[i][j] = 0;
		this.numeroVertices = 0;
	}

	public void nuevoVertice(String nom) {
		boolean esta = numVertice(nom) >= 0;
		if (!esta) {
			Vertice v = new Vertice(nom);
			v.setNumVertice(numeroVertices);
			vertices[numeroVertices++] = v;
		}
	}

	public int numVertice(String vs) {
		Vertice v = new Vertice(vs);
		boolean encontrado = false;
		int i = 0;
		for (; (i < numeroVertices) && !encontrado;) {
//		while((i < numeroVertices) && !encontrado){			
			encontrado = vertices[i].equals(v);
			if (!encontrado)
				i++;
		}
		return (i < numeroVertices) ? i : -1;
	}

	public void nuevoArco(String a, String b) throws Exception {
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("V�rtice no existe");
		this.matrizAdy[va][vb] = 1;
	}

	public void nuevoArco(int va, int vb) throws Exception {
		if (va < 0 || vb < 0)
			throw new Exception("V�rtice no existe");
		this.matrizAdy[va][vb] = 1;
	}

	public boolean adyacente(String a, String b) throws Exception {
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("V�rtice no existe");
		return this.matrizAdy[va][vb] == 1;
	}

	public boolean adyacente(int va, int vb) throws Exception {
		if (va < 0 || vb < 0)
			throw new Exception("V�rtice no existe");
		return this.matrizAdy[va][vb] == 1;
	}
	
}
