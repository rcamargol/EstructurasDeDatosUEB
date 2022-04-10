package co.edu.unbosque.model;

//https://aulaenlanube.com/zona-programacion/java/ejercicios-recursividad-java/
public class ClaseX {
	ClaseY y;
	Lista l;
	Busqueda b;

	public ClaseX() {
		y = new ClaseY();
		l = new Lista();
		b = new Busqueda();
	}

	public int calcularFactorial(int n) {
		int fact = -1;
		if (n == 0)
			fact = 1;
		else {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}

	public int calcularFactorialRecursivo(int n) {
		int fact = -1;
		if (n == 0)
			fact = 1;
		else {
			fact = calcularFactorialRecursivo(n - 1) * n;
		}
		return fact;
	}

	public int sumarNumerosRec(int n) {
		int suma = 0;
		if (n > 1) {
			suma = n + sumarNumerosRec(n - 1);
		} else
			suma = 1;
		return suma;
	}

	public void imprimirDigitosRec(int n) {
		if (n > 1)
			imprimirDigitosRec(n - 1);
		System.out.print("Pila: imprimirDigitosRec(int " + n + ")-->");
	}

	public int generarFiboRec(int n) {
		int n3 = 0;
		System.out.println("fibo(" + n + ") ");
		if (n == 1)
			n3 = 0;
		else if (n == 2)
			n3 = 1;
		else {
			n3 = generarFiboRec(n - 1) + generarFiboRec(n - 2);
		}
		return n3;
	}

	public int elevarRec(int x, int y) {
		int pot = 1;
		System.out.println( x + " a la "+ y);
		if(y == 0)
			pot = 1;
		else
			pot = x * elevarRec(x , y-1);
		return pot;
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	public Busqueda getB() {
		return b;
	}

	public void setB(Busqueda b) {
		this.b = b;
	}

	public Lista getL() {
		return l;
	}

	public void setL(Lista l) {
		this.l = l;
	}

}
