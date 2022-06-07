package co.edu.unbosque.model;

public class GrafoMatriz {
	private static int numeroVertices; // numero de vertices que tiene el grafo
	private static int MaxVertices = 20;
	private static Vertice[] vertices; // arreglo de vertices que tiene el grafo
	private int[][] matrizAdy; // matriz de adyacencia

	public GrafoMatriz() {
		this(MaxVertices);
	}

	public GrafoMatriz(int maximo) {
		this.matrizAdy = new int[maximo][maximo];
		this.vertices = new Vertice[maximo];
		for (int i = 0; i < maximo; i++)
			for (int j = 0; i < maximo; i++)
				this.matrizAdy[i][j] = 0;
		this.numeroVertices = 0;
	}

	public void nuevoVertice(String nombre) {
		boolean esta = buscarVertice(nombre) >= 0;
		if (!esta) {
			Vertice v = new Vertice(nombre);
			v.setNumeroVertice(numeroVertices);
			vertices[numeroVertices++] = v;
		}
	}

	public static int buscarVertice(String numero) {
		Vertice v = new Vertice(numero);
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
		va = buscarVertice(a);
		vb = buscarVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		this.matrizAdy[va][vb] = 1;
	}

	public void nuevoArco(int va, int vb) throws Exception {
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		this.matrizAdy[va][vb] = 1;
	}

	public boolean adyacente(String a, String b) throws Exception {
		int va, vb;
		va = buscarVertice(a);
		vb = buscarVertice(b);
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		return this.matrizAdy[va][vb] == 1;
	}

	public boolean adyacente(int va, int vb) throws Exception {
		if (va < 0 || vb < 0)
			throw new Exception("Vértice no existe");
		return this.matrizAdy[va][vb] == 1;
	}
/*
	public static int[]recorrerAnchura(String org) throws Exception {
		int w, v;
		int [] m;
		v = buscarVertice(org);
		if (v < 0) throw new Exception("Vértice origen no existe");
		Cola cola = new Cola();
		m = new int[numeroDeVertices()];
		// inicializa los vértices como no marcados
		for (int i = 0; i < g.numeroDeVertices(); i++)
			m[i] = CLAVE;
		m[v] = 0; // vértice origen queda marcado
		cola.insertar(new Integer(v));
		while (! cola.colaVacia()){
			Integer cw;
			cw = (Integer) cola.quitar()
			w = cw.intValue();
			System.out.println("Vértice " + g.verts[w] + "visitado");
			// inserta en la cola los adyacentes de w no marcados
			for (int u = 0; u < g.numeroDeVertices(); u++)
				if ((g.matAd[w][u] == 1) && (m[u] == CLAVE)){
					// se marca vertice u con número de arcos hasta el
					m[u] = m[w] + 1;
					cola.insertar(new Integer(u));
				}
			}
		return m;
	}
*/
	public int getNumeroVertices() {
		return numeroVertices;
	}

	public void setNumeroVertices(int numeroVertices) {
		this.numeroVertices = numeroVertices;
	}

	public static int getMaxVertices() {
		return MaxVertices;
	}

	public static void setMaxVertices(int maxVertices) {
		MaxVertices = maxVertices;
	}

	public Vertice[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertice[] vertices) {
		this.vertices = vertices;
	}

	public int[][] getMatrizAdy() {
		return matrizAdy;
	}

	public void setMatrizAdy(int[][] matrizAdy) {
		this.matrizAdy = matrizAdy;
	}

}
