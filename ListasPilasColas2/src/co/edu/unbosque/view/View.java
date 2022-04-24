package co.edu.unbosque.view;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.Nodo;

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
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre Nùmero:"));
		return numero;
	}

	public void mostrarLista(Nodo nodo) {
		int i = 0;
		if (nodo == null)
			System.out.println("Lista vacia");
		else
			while (nodo != null) {
				System.out.print("(" + nodo.getInfo()+")-->");
				nodo = nodo.getSiguiente();
			}
			System.out.println();
	}
	
}
