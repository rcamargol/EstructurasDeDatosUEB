package co.edu.unbosque.view;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.NodoA;

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
	
	public void mostrarPreorden(NodoA raiz) {
		if(raiz != null) {
			System.out.print(raiz.getInfo()+" -- ");
			mostrarPreorden(raiz.getIzquierda());
			mostrarPreorden(raiz.getDerecha());
		}
		System.out.println();
	}
	
	public void mostrarInorden(NodoA raiz) {
		if(raiz != null) {
			mostrarInorden(raiz.getIzquierda());
			System.out.print(raiz.getInfo()+" -- ");
			mostrarInorden(raiz.getDerecha());
		}
	}
	
	public void mostrarPosorden(NodoA raiz) {
		if(raiz != null) {
			mostrarPosorden(raiz.getIzquierda());
			mostrarPosorden(raiz.getDerecha());
			System.out.print(raiz.getInfo()+" -- ");
		}
	}

}
