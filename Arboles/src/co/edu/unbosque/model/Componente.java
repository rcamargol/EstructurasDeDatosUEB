package co.edu.unbosque.model;

public class Componente {
	private Pagina s;
	int v;
	
	Componente(Pagina s, int v){
		this.s = s;
		this.v = v;
	}
	Componente(){
		
	}
	public Pagina getS() {
		return s;
	}
	public void setS(Pagina s) {
		this.s = s;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	
	
}
