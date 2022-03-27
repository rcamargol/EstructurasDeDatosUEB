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
		//probarListaOrdenada();
		//probarPila();
		//probarCola();
		probarListaInvertida();
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
		int [] numeros = {7,3,8,1,40,10,4,2,-1};
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getL().insertarListaOrdenada(numeros[i],2);
			gui.mostrarLista(m.getL().getCabeza());
		}
	}
	
	public void probarPila() {
		int [] numeros = {-1,0,1,2};
		System.out.println("Hacer PUSH");
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getP().hacerPUSH(numeros[i]);
			//gui.mostrarLista(m.getP().getCabeza());
			gui.mostrarLista(m.getP().hacerPEEK());
		}
		System.out.println("Hacer POP");
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getP().hacerPOP();
			//gui.mostrarLista(m.getP().getCabeza());
			gui.mostrarLista(m.getP().hacerPEEK());
		}
	}
	
	public void probarCola() {
		int [] numeros = {-1,0,1,2};
		System.out.println("Encolar");
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getC().encolar(numeros[i]);
			//gui.mostrarLista(m.getP().getCabeza());
			gui.mostrarLista(m.getC().getCabeza());
		}
		System.out.println("Decolar");
		for (int i = 0 ; i< numeros.length ; i++) {
			gui.mostrarResultados("Atendiendo a: "+m.getC().getElementoFrente().getInfo());
			m.getC().decolar();
			//gui.mostrarLista(m.getP().getCabeza());
			gui.mostrarLista(m.getC().getCabeza());
		}
	}
	
	public void probarListaInvertida() {
		int [] numeros = {7,3,8};
		for (int i = 0 ; i< numeros.length ; i++) {
			m.getL().insertarNodoFinal(numeros[i]);
		}
		System.out.println("Original");
		gui.mostrarLista(m.getL().getCabeza());
		//m.getL().invertirLista();
		m.getL().invertirListaRecursiva(m.getL().getCabeza(),m.getL().getCabeza().getSiguiente());
		System.out.println("Invertida");
		//gui.mostrarLista(m.getL().getCabeza());
	}
}
