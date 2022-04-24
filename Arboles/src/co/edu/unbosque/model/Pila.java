package co.edu.unbosque.model;

public class Pila extends Lista{
	
	public void hacerPUSH(Object info) {
		super.insertarNodoInicio(info);
	}
	public void hacerPOP() {
		super.removerNodo(super.cabeza.getInfo());
	}
	public Object hacerPEEK() {
		if(super.cabeza!=null) {
			return(super.cabeza);
			//fin del metodo que esta complto
		}
		return null;
	}
	
}

