package co.edu.unbosque.model;

public class Ordenamiento {

	private static int[] a;

	public Ordenamiento() {
		a = new int[5];
	}

	public static void inicializarArray() {
		a[0] = 36;
		a[1] = 24;
		a[2] = 10;
		a[3] = 6;
		a[4] = 12;
		System.out.println("Inicial");
		for (int k = 0; k < a.length; k++) {
			System.out.print(" [" + a[k] + "] ");
		}
		System.out.println();
	}

	public void ordenarBurbuja() {
		inicializarArray();
		int i, j, t, n, k, ninterc = 0;
		n = a.length;

		for (i = n; i > 0; i--) {
			for (j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					intercambiar(j, j + 1);
					ninterc++;
				}
				System.out.println("Iteración #:" + ninterc);
				for (k = 0; k < n; k++)
					System.out.print(" [" + a[k] + "] ");
				System.out.println("(" + j + "," + i + ")");
				System.out.println();
			}

		}
	}

	public static void intercambiar(int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public void ordenarSeleccion() {
		inicializarArray();
		int indiceMenor, i, j, n;
		n = a.length;
		for (i = 0; i < n - 1; i++) {
			// comienzo de la exploración en índice i
			indiceMenor = i;
			// j explora la sublista a[i+1]..a[n-1]
			for (j = i + 1; j < n; j++)
				if (a[j] < a[indiceMenor])
					indiceMenor = j;
			// sitúa el elemento mas pequeño en a[i]
			if (i != indiceMenor)
				intercambiar(i, indiceMenor);
		}
	}

	public void ordenarIntercambio() {
		inicializarArray();
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					intercambiar(i, j);
				}
	}

	public void ordenarInsercion() {
		inicializarArray();
		int i, j;
		int aux;
		for (i = 1; i < a.length; i++) {
			/*
			 * indice j es para explorar la sublista a[i-1]..a[0] buscando la posicion
			 * correcta del elemento destino
			 */
			j = i;
			aux = a[i];
			// se localiza el punto de inserción explorando hacia abajo
			while (j > 0 && aux < a[j - 1]) {
				// desplazar elementos hacia arriba para hacer espacio
				a[j] = a[j - 1];
				j--;
			}
			a[j] = aux;
		}
	}

	public void ordenarShell() {
		int intervalo, i, j, k;
		int n = a.length;
		intervalo = n / 2;
		while (intervalo > 0) {
			for (i = intervalo; i < n; i++) {
				j = i - intervalo;
				while (j >= 0) {
					k = j + intervalo;
					if (a[j] <= a[k])
						j = -1; // par de elementos ordenado
					else {
						intercambiar(j, j + 1);
						j -= intervalo;
					}
				}
			}
			intervalo = intervalo / 2;
		}
	}

	public static void ordenarQuicksort() {
		inicializarArray();
		ordenarQuicksort(0, a.length - 1);
	}

	private static void ordenarQuicksort(int primero, int ultimo) {
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
				intercambiar(i, j);
				i++;
				j--;
			}
		} while (i <= j);
		if (primero < j)
			ordenarQuicksort(primero, j); // mismo proceso con sublista izqda
		if (i < ultimo)
			ordenarQuicksort(i, ultimo); // mismo proceso con sublista drcha
	}

	public void ordenarShakesort() {
		inicializarArray();
		int l, r, k, i, j, t, ninterc = 0;
		int n = a.length;
		l = 1;
		r = n - 1;
		k = n - 1;
		do {
			for (j = r; j >= l; j--)
				if (a[j - 1] > a[j]) {
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					k = j;
					ninterc++;
				}
			l = k + 1;
			for (j = l; j <= r; j++)
				if (a[j - 1] > a[j]) {
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					k = j;
					ninterc++;
				}
			r = k - 1;
		} while (l < r);

	}

	public void ordenarRadixsort() {
		int[][] bucket = new int[10][a.length];
		int[] bucketOfElement = new int[10];
		int max = 0;
		// Encuentra el elemento más grande en la matriz
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		// Calcula el número de bits del elemento más grande
		int maxLength = (max + "").length();
		for (int m = 0, n = 1; m < maxLength; m++, n *= 10) {
			// Coloca los números en a en los cubos correspondientes según sus unidades,
			// decenas, centenas, etc.
			for (int i = 0; i < a.length; i++) {
				int digit = a[i] / n % 10;
				// Asignar el valor de a [i] a la matriz bidimensional en el depósito
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
