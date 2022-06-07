package co.edu.unbosque.model;

public class Grafo {
	private final int MAXIMO=4;
	private int[][] matriz;
	
	public Grafo() {
		matriz = new int[MAXIMO][MAXIMO]; 
		for(int i=0 ; i< MAXIMO ; i++)
			for(int j=0 ; j<MAXIMO; j++)
				matriz[i][j]=0;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	
	
}
