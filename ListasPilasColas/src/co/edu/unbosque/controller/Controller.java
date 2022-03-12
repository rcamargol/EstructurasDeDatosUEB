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
		probarListaOrdenada();
	}

	public void funcionar() {
		if (m.getY().listaVacia())
			m.getY().crearLista(99);
		for (int i = 0; i < 3; i++) {
			m.getY().insertarNodoFinal(i+1);
		}
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("busqueda de 67");
		gui.mostrarLista(m.getY().buscarInfoLista(67));
		System.out.println("Insertar -100 al inicio");
		m.getY().insertarNodoInicio(-100);
		System.out.println("Insertar -300 al inicio");
		m.getY().insertarNodoInicio(-300);
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("Insertar 67 al final");
		m.getY().insertarNodoFinal(67);
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("Insertar 79 entre 3 y 67");
		m.getY().insertarNodoEntreNodos(79, 3, 67);
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("busqueda de 67");
		gui.mostrarLista(m.getY().buscarInfoLista(67));
		System.out.println("Eliminar 99");
		System.out.println(m.getY().removerNodo(99));
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("Eliminar -300");
		System.out.println(m.getY().removerNodo(-300));
		gui.mostrarLista(m.getY().getCabeza());

	}
	
	public void probarListaOrdenada() {
		int [] numeros = {7,3,8,1,10,4,2,40};
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getL().insertarListaOrdenada(numeros[i]);
			gui.mostrarLista(m.getL().getCabeza());
		}
	}
}
