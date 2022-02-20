package co.edu.unbosque.model;

public class ClaseX {
	private Ordenamiento ordenamiento;
	private Busqueda busqueda;
	
	
	public ClaseX() {
		ordenamiento = new Ordenamiento();
		busqueda = new Busqueda();
	}

	public Ordenamiento getOrdenamiento() {
		return ordenamiento;
	}

	public void setOrdenamiento(Ordenamiento ordenamiento) {
		this.ordenamiento = ordenamiento;
	}

	public Busqueda getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(Busqueda busqueda) {
		this.busqueda = busqueda;
	}
	
	
	
}
