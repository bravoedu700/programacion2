package base;

import java.util.*;

import busquedas.Criterio;

public class PlayListSimple extends Musica {
	
	Vector <Musica> elementos = new Vector<Musica>();

	public PlayListSimple(String nom) {
		nombre = nom;
	}

	public Vector<Musica> getElementos() {
		return elementos;
	}

	public void addElemento (Musica m){
		elementos.add(m);
	}
	
	public Vector<Pista> busqueda(Criterio c){
		Vector <Pista> resultado = new Vector<Pista>();
		for(Enumeration<Musica> E = elementos.elements(); E.hasMoreElements();)
				resultado.addAll(E.nextElement().busqueda(c));
		return resultado;
	}
	
	public String toString(){	
		return this.getNombre();
	}
	
	public int getDuracion() {
		int acum = 0;
		for (Musica m : getElementos()){
			acum +=m.getDuracion();
		}
		return acum;
	}

	public int CantidadElementos() {
		int cantidad = 0;
		for(int i = 0; i < this.elementos.size(); i++){
			cantidad += this.elementos.elementAt(i).CantidadElementos();
		}
		return cantidad;
	}
	
}
