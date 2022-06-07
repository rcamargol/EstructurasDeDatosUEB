package co.edu.unbosque.model;

public class Vertice {//Representa un nodo en el grafo
	private String nombreVertice;
	private int numeroVertice;

	public Vertice(String nombre) {
		this.nombreVertice = nombre;
		this.numeroVertice  = -1;
	}

	public String getNombreVertice() // devuelve identificador del vértice
	{
		return this.nombreVertice;
	}

	public boolean equals(Vertice vertice) // true, si dos vértices son iguales
	{
		return nombreVertice.equals(vertice.nombreVertice);
	}

	public int getNumeroVertice() {
		return numeroVertice;
	}

	public void setNumeroVertice(int numeroVertice) {
		this.numeroVertice = numeroVertice;
	}

	public String toString() // características del vértice
	{
		return this.nombreVertice + " (" + this.numeroVertice + ")";
	}
}
