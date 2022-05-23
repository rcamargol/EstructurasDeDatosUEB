package co.edu.unbosque.model;

public class Pagina {
	//relativo a la pagina del arbol B
	private final int N = 2;
	private final int M = 4;
	private final int M1 = 5; //M1 = M + 1
	
	private int cont;
	
	private int[] info;
	private Pagina[] apuntador;
	
	public Pagina() {
		info = new int[M];
		apuntador = new Pagina[M1];
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int[] getInfo() {
		return info;
	}

	public void setInfo(int[] info) {
		this.info = info;
	}

	public Pagina[] getApuntador() {
		return apuntador;
	}

	public void setApuntador(Pagina[] apuntador) {
		this.apuntador = apuntador;
	}
	
	

}
