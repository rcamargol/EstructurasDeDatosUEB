package co.edu.unbosque.model;

public class Vertice {//Representa un nodo en el grafo
	private String nombreVertice;
	private int numeroVertice;

	public Vertice(String x) {
		this.nombreVertice = x;
		this.numeroVertice  = -1;
	}

	public String getNombreVertice() // devuelve identificador del v�rtice
	{
		return this.nombreVertice;
	}

	public boolean equals(Vertice n) // true, si dos v�rtices son iguales
	{
		return nombreVertice.equals(n.nombreVertice);
	}

	public void setNumVertice(int n) // establece el n�mero de v�rtices

	{
		this.numeroVertice = n;
	}

	public String toString() // caracter�sticas del v�rtice
	{
		return this.nombreVertice + " (" + this.numeroVertice + ")";
	}
}
