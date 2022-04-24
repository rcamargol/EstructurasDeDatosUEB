package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		gui = new View();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
		funcionar();
	}
	
	public void funcionar() {
		gui.mostrarPreorden(m.crearArbol());
		gui.mostrarInorden(m.crearArbol());
		gui.mostrarPosorden(m.crearArbol());
	}
}
