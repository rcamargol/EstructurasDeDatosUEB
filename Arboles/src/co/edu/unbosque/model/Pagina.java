package co.edu.unbosque.model;

public class Pagina {
	
	private final int N = 2;
	private final int M = 3;
	private final int M1 = 5; //M1 = M + 1
	
	private int cont;
	
	private int[] info;
	private Pagina[] apuntador;
	
	public Pagina() {
		info = new int[M];
		apuntador = new Pagina[M1];
	}
	
	

}
