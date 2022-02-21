package co.edu.unbosque.model;

public class Busqueda {

	private static int[] a;

	public Busqueda() {
		a = new int[5];
	}

	public static void inicializarArray() {
		a[0] = 36;
		a[1] = 24;
		a[2] = 10;
		a[3] = 6;
		a[4] = 12;
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
}
