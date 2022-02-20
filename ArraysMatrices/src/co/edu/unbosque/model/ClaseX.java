package co.edu.unbosque.model;

import java.util.Vector;

public class ClaseX {
	
	private ClaseY y;
	private Object[] objetos;
	private float[] a = new float[6]; 
	private int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
	private Vector<Object> v = new Vector<Object>();
	private int tabla1[][] = { {51, 52, 53},{54, 55, 56} };
	private int tabla2[][] = {
	{1, 2, 3, 4},
	{5, 6, 7, 8},
	{9, 10, 11, 12}
	};
	
	public ClaseX() {
		y = new ClaseY();
		inicializarArray();
		inicializarVector();
	}

	public String procesarDato(String dato) {
		return dato + " Proceso en ClaseX";
	}

	public int sumar20alDato(int dato, Object algo) {
		if(algo.equals(getTabla2())) {
			boolean otra = true;
		}
		return dato+20;
	}
	
	public int[][]  inicializarMatrices() {
		return this.tabla1;
	}
	
	public float[] inicializarArray() {
		for (int i=0 ; i<6 ; i++) {
			a[i] = (float) Math.random();
		}
		return this.a;
	}
	
	public void inicializarVector() {
		v.add(this.a);
		v.add(this.tabla2);
		this.objetos[0] = this.a;
	}
	
	
	public float[] getA() {
		return a;
	}

	public void setA(float[] a) {
		this.a = a;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[][] getTabla1() {
		return tabla1;
	}

	public void setTabla1(int[][] tabla1) {
		this.tabla1 = tabla1;
	}

	public int[][] getTabla2() {
		return tabla2;
	}

	public void setTabla2(int[][] tabla2) {
		this.tabla2 = tabla2;
	}

	public Vector<Object> getV() {
		return v;
	}

	public void setV(Vector<Object> v) {
		this.v = v;
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

	
}
