package co.edu.unbosque.model;

public class Vertice {//Representa un nodo en el grafo
	private String nombreVertice;
	private int numeroVertice;

	public Vertice(String x) {
		this.nombreVertice = x;
		this.numeroVertice  = -1;
	}

	public String getNombreVertice() // devuelve identificador del vértice
	{
		return this.nombreVertice;
	}

	public boolean equals(Vertice n) // true, si dos vértices son iguales
	{
		return nombreVertice.equals(n.nombreVertice);
	}

	public void setNumVertice(int n) // establece el número de vértices

	{
		this.numeroVertice = n;
	}

	public String toString() // características del vértice
	{
		return this.nombreVertice + " (" + this.numeroVertice + ")";
	}
}
