package co.edu.unbosque.model;

public class Grafo {
	private final int MAXIMO=20;
	private int[][] matriz;
	
	public Grafo() {
		for(int i=1 ; i<= MAXIMO ; i++)
			for(int j=1 ; j<=MAXIMO; j++)
				matriz[i][j]=0;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	
	
}
