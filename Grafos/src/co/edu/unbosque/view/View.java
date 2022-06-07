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
	
	public int pedirDatoEntero(String mensaje) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
		return numero;
	}
	
	public int[][] leerGrafo(int maximo){
		int[][] matriz = new int[maximo][maximo];
		int vertice, ady;
		for(int i=0 ; i<maximo ; i++ )
			for (int j=0 ; j< maximo ; j++)
				matriz[i][j]=0;
		vertice = pedirDatoEntero("Digite Fila Vertice - 99 para terminar");
		while (vertice != 99) {
			ady = pedirDatoEntero("Digite Adyacencia del Vertice - 99 para terminar");
			while (ady != 99) {
				matriz[vertice][ady] = 1;
				ady = pedirDatoEntero("Digite Adyacencia del Vertice - 99 para terminar");
			}
			vertice = pedirDatoEntero("Digite Fila Vertice - 99 para terminar");
		}
		return matriz;
	}
}
