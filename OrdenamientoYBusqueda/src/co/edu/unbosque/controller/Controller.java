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
		int a[] = {44,55,12,42,94,18,6,67};
		m.getOrdenamiento().setA(a);
		m.getOrdenamiento().mostrarArrayInicial("Método Shell");
		m.getOrdenamiento().ordenarShell(a);
		gui.mostrarArreglo(m.getOrdenamiento().getA());
	}
}
