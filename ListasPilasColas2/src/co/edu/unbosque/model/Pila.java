package co.edu.unbosque.model;

public class Pila extends Lista{
	
	public void hacerPUSH(int info) {
		super.insertarNodoInicio(info);
	}
	public void hacerPOP() {
		super.removerNodo(super.cabeza.getInfo());
	}
	public Nodo hacerPEEK() {
		if(super.cabeza!=null) {
			return(super.cabeza);
			//fin del metodo que esta complto
		}
		return null;
	}
	
}

