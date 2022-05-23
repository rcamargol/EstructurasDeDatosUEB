package co.edu.unbosque.model;

public class ArbolB {
	
	public void listarArbolB(Pagina p) {
		int i;
		Pila pila = new Pila();
		Componente objeto;
		while(p != null) {
			objeto = new Componente(p, 0);
			pila.hacerPUSH(objeto);
			p = p.getApuntador()[0];
			objeto = null;
		}
		while(!pila.listaVacia()) {
			objeto = (Componente)pila.hacerPEEK();
			pila.hacerPOP();
			i = objeto.getV();
			p = objeto.getS();
			if (i < p.getCont()) {
				System.out.print(p.getInfo()+"--");
				objeto = new Componente(p, i+1);
				pila.hacerPUSH(objeto);
				p = p.getApuntador()[i+1];
				while(p != null) {
					objeto = new Componente(p,0);
					pila.hacerPUSH(objeto);
					p = p.getApuntador()[0];
					objeto = null;
				}
			}
		}
	}

}
