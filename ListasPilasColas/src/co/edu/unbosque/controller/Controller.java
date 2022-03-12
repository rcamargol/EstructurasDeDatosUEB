package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {

	private ClaseX m;
	private View gui;

	public Controller() {
		m = new ClaseX();
		gui = new View();
		funcionar();
	}

	public void funcionar() {
		if (m.getY().listaVacia())
			m.getY().crearLista(-1);
		for (int i = 0; i < 5; i++) {
			m.getY().insertarNodoFinal(i * 2);
		}
		gui.mostrarLista(m.getY().getCabeza());
		System.out.println("busqueda");
		gui.mostrarLista(m.getY().buscarInfoLista(67));
		System.out.println("Insertar al inicio");
		m.getY().insertarNodoInicio(-100);
		gui.mostrarLista(m.getY().getCabeza());
		
	}
}
