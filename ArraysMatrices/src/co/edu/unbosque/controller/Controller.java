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
		for(int i=0 ; i< m.getV().size(); i++) {
			if(m.getV().get(i).equals(m.getA()) ) {
				gui.imprimirArray(m.getA());
			}
			
			if(m.getV().get(i).equals(m.getTabla2())) {
				gui.imprimirMatriz(m.getTabla2());
			}
		}
	}
}
