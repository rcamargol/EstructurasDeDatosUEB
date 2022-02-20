package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDato() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, "Entre Dato:");
		return dato;
	}
	
	public int pedirDatoEntero() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Nùmero:"));
		return numero;
	}
	
	public void imprimirArray(float[] array) {
		String cadena = "";
		for (int i=0 ; i< array.length; i++) {
			cadena+="El valor ("+i+") es:"+array[i]+"\n";
		}
		mostrarResultados(cadena);
	}
	
	public void imprimirMatriz(int[][] matrix) {
		String cadena = "";
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				cadena += matrix[i][j]+" | ";
			}
			cadena+="\n";
		}
		mostrarResultados(cadena);
	}
}
