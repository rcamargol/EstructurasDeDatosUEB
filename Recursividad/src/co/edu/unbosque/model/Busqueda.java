package co.edu.unbosque.model;

public class Busqueda {

	private static int[] a;

	public Busqueda() {
		a = new int[5];
		inicializarArray();
	}

	public static void inicializarArray() {
		a[0] = 6;
		a[1] = 10;
		a[2] = 12;
		a[3] = 24;
		a[4] = 36;
	}

	public int busquedaSecuencial(int elemento) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elemento) {
				return i;
			}
		}
		return -1;
	}

	public int busquedaBinaria(int elemento) {
		int central, bajo, alto;
		int valorCentral;
		bajo = 0;
		alto = a.length - 1;
		while (bajo <= alto) {
			central = (bajo + alto) / 2; 
			valorCentral = a[central]; 
			if (elemento == valorCentral)
				return central; 
			else if (elemento < valorCentral)
				alto = central - 1; 
			else
				bajo = central + 1; 
		}
		return -1; 
	}
	
	public int busquedaBinariaRecursiva(int elemento) {
		return busquedaBinariaRec(elemento, 0, a.length-1);
	}
	
	private int busquedaBinariaRec(int elemento, int bajo, int alto) {
		int central=-1;
		int posicion=-1;;
		if (bajo <= alto) {
			central = (bajo + alto) / 2; 
			if (elemento == a[central]) {
				posicion = central; 
			}
			else if (elemento < a[central])
				posicion = busquedaBinariaRec(elemento, bajo, central - 1);
			else
				posicion = busquedaBinariaRec(elemento, central + 1, alto);
		}
		return posicion; 
	}
}
