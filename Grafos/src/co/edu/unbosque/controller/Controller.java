package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller {
	
	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		gui = new View();
		m.getG().setMatriz(gui.leerGrafo(4));
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
}
