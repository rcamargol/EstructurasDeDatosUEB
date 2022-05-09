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
		//gui.mostrarPreorden(m.crearArbol());
//<<<<<<< HEAD
		//gui.mostrarInorden(m.crearArbol());
		gui.mostrarNiveles(m.crearArbol());
		//gui.mostrarPosorden(m.crearArbol());
		//m.crearABB();
		//gui.mostrarInorden(m.crearABB());
		//gui.mostrarInorden(m.getAb().buscarArbolABB(7));
//=======
		//gui.mostrarNiveles(m.crearArbol());
		//gui.mostrarInorden(m.crearArbol());
		m.crearABB();
		//gui.mostrarPreorden(m.crearABB());
		gui.mostrarInorden(m.getAb().getRaiz());
		//gui.mostrarInorden(m.getAb().buscarArbolABB(8));
		System.out.println("despues de retirar 1: "+m.getAb().borrarNodoArbolABB(1));
		gui.mostrarInorden(m.getAb().getRaiz());
//>>>>>>> branch 'master' of https://github.com/rcamargol/EstructurasDeDatosUEB.git
	}
}
