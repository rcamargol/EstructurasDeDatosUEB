package co.edu.unbosque.model;
//https://aulaenlanube.com/zona-programacion/java/ejercicios-recursividad-java/
public class ClaseX {
	ClaseY y;
	Lista l;
	Busqueda b;

	public ClaseX() {
		y = new ClaseY();
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
			fact = calcularFactorialRecursivo(n-1) * n;
		}
		return fact;
	}

	public int sumarNumerosRec(int n) {
		int suma = 0;
		if(n > 1){
		 	suma = n + sumarNumerosRec(n-1);
		}
		else 
			suma = 1;
		return suma;
	}
	
	public void imprimirDigitosRec(int n) {
		if(n > 1)
			imprimirDigitosRec(n-1);
		System.out.print("Pila: imprimirDigitosRec(int "+n+")-->");
	}
	
	public void generarFiboRec1(int n) {
		int n1, n2, n3;
		n1 = 0;
		n2 = 1;
		System.out.print(n1+" "+n2);
		for (int i=2 ; i<n ; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	public void generarFiboRec(int n) {
		int n1, n2, n3;
		n1 = 0;
		n2 = 1;
		if (n == 2)
			System.out.print(n1+" "+n2);
		else {
			//n3 = generarFiboRec(n1) + generarFiboRec(n2);
		}
		for (int i=2 ; i<n ; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
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
