package co.edu.unbosque.model;

public class Ordenamiento {

	private static int[] a;

	public void mostrarArrayInicial(String metodo) {
		System.out.println(metodo);
		System.out.println();
		System.out.print("Arr. Inicial:>");
		for (int k = 0; k < a.length; k++) {
			System.out.print(" [" + a[k] + "] ");
		}
		System.out.println();
	}

	public void mostrarEtapas(int[]a, int iteracion) {
		int k;
		int n = a.length;
		System.out.print("Iteración #:" + iteracion+">");
		for (k = 0; k < n; k++)
			System.out.print(" [" + a[k] + "] ");
		System.out.println();
	}
	
	public void ordenarBurbuja(int [] a) {
		int i, j, n,iteracion = 0;
		n = a.length;
		for (i = n; i > 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					intercambiar(a, j, j + 1);
					iteracion++;
				}
				mostrarEtapas(a,iteracion);
			}

		}
	}

	public static void intercambiar(int [] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public void ordenarSeleccion(int [] a) {
		int indiceMenor, i, j, n, iteracion=0;
		n = a.length;
		for (i = 0; i < n - 1; i++) {
			indiceMenor = i;
			for (j = i + 1; j < n; j++)
				if (a[j] < a[indiceMenor])
					indiceMenor = j;
			if (i != indiceMenor)
				intercambiar(a, i, indiceMenor);
			iteracion++;
			mostrarEtapas(a, iteracion);
		}
	}

	public void ordenarIntercambio(int [] a) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			for (j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					intercambiar(a, i, j);
				}
	}

	public void ordenarInsercion(int [] a) {
		int i, j,iteracion=0;
		int aux;
		for (i = 1; i < a.length; i++) {
			j = i;
			aux = a[i];
			while (j > 0 && aux < a[j - 1]) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = aux;
			iteracion++;
			mostrarEtapas(a, iteracion);
		}
	}

	public void ordenarShell(int [] a) {
		int intervalo, i, j, k, iteracion=0;
		int n = a.length;
		intervalo = n / 2;
		while (intervalo > 0) {
			for (i = intervalo; i < n; i++) {
				j = i - intervalo;
				while (j >= 0) {
					k = j + intervalo;
					if (a[j] <= a[k])
						j = -1; 
					else {
						intercambiar(a, j, j + 1);
						j -= intervalo;
						iteracion++;
						mostrarEtapas(a,iteracion);
					}
				}
			}
			intervalo = intervalo / 2;
		}
	}

	public static void ordenarQuicksort(int [] a) {
		ordenarQuicksort(a, 0, a.length - 1);
	}

	private static void ordenarQuicksort(int [] a, int primero, int ultimo) {
		int i, j, central;
		double pivote;
		central = (primero + ultimo) / 2;
		pivote = a[central];
		i = primero;
		j = ultimo;
		do {
			while (a[i] < pivote)
				i++;
			while (a[j] > pivote)
				j--;
			if (i <= j) {
				intercambiar(a, i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j)
			ordenarQuicksort(a, primero, j); // mismo proceso con sublista izqda
		if (i < ultimo)
			ordenarQuicksort(a, i, ultimo); // mismo proceso con sublista drcha
	}

	public void ordenarShakesort(int [] a) {
		int l, r, k, i, j, t, iteracion = 0;
		int n = a.length;
		l = 1;
		r = n - 1;
		k = n - 1;
		do {
			for (j = r; j >= l; j--)
				if (a[j - 1] > a[j]) {
					intercambiar(a, j-1, j);
					k = j;
					iteracion++;
					mostrarEtapas(a, iteracion);
				}
			l = k + 1;
			for (j = l; j <= r; j++)
				if (a[j - 1] > a[j]) {
					intercambiar(a, j-1, j);
					k = j;
					iteracion++;
					mostrarEtapas(a, iteracion);
				}
			r = k - 1;
		} while (l < r);
	}

	public void ordenarRadixsort(int [] a) {
		int[][] bucket = new int[10][a.length];
		int[] bucketOfElement = new int[10];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int maxLength = (max + "").length();
		for (int m = 0, n = 1; m < maxLength; m++, n *= 10) {
			for (int i = 0; i < a.length; i++) {
				int digit = a[i] / n % 10;
				bucket[digit][bucketOfElement[digit]] = a[i];
				bucketOfElement[digit]++;
			}
			int index = 0;
			// Leer los elementos en el depósito y reasignarlos a a
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < bucketOfElement[j]; k++) {
					a[index] = bucket[j][k];
					index++;
				}
				bucketOfElement[j] = 0;// Borrar el número de elementos en cada uno
			}
		}
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

}
