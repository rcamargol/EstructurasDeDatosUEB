package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {

	private ClaseX m;
	private View gui;

	public Controller() {
		m = new ClaseX();
		gui = new View();
		//funcionar();
		//probarListaInvertida();
		probarImprimirListaRec();
	}

	
	public void funcionar() {
		//gui.mostrarResultados("Busqueda normal:"+m.getB().busquedaBinaria(6));
		//gui.mostrarResultados("Busqueda Recursiva:"+m.getB().busquedaBinariaRecursiva(10));
		//m.getB().busquedaBinariaRecursiva(54);
		//gui.mostrarResultados("Fact normal:"+m.calcularFactorial(5));
		//gui.mostrarResultados("Fact Recursivo:"+m.calcularFactorialRecursivo(5));
		//gui.mostrarResultados("Ejer Recursivo:"+m.sumarNumerosRec(5));
		//m.imprimirDigitosRec(3);
		//gui.mostrarResultados("Numero fibo:"+m.generarFiboRec(3));
		gui.mostrarResultados("Potencia Rec:"+m.elevarRec(5,4));
	}
	
	public void probarImprimirListaRec() {
		int [] numeros = {7,3,8,5};
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getL().insertarNodoFinal(numeros[i]);
		}
		System.out.println("Original");
		gui.mostrarLista(m.getL().getCabeza());
		//m.getL().invertirLista();
		//m.getL().invertirListaRecursiva(m.getL().getCabeza(),m.getL().getCabeza().getSiguiente());
		System.out.println("Recursiva");
		gui.mostrarListaRec(m.getL().getCabeza());
		System.out.println();
		System.out.println("contar ReC:"+m.getL().contarNodosRec(m.getL().getCabeza()));
		//m.getL().contarNodosRec(m.getL().getCabeza());
	}
	
}
