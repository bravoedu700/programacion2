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
		Vector <Pista> pistas = new Vector<Pista>();
		Vector <Pista> pistasRetornados = new Vector<Pista>();
		for(Enumeration<Musica> e = elementos.elements(); e.hasMoreElements();){
				pistasRetornados = e.nextElement().busqueda(c);
				for(Enumeration<Pista> f = pistasRetornados.elements(); f.hasMoreElements();){
					Pista miPista = f.nextElement();
					if(!pistas.contains(miPista))	
						pistas.addElement(miPista);
				}				
		}
		return pistas;
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

	public int cantidadElementos() {
		int cantidad = 0;
		for(int i = 0; i < this.elementos.size(); i++){
			cantidad += this.elementos.elementAt(i).cantidadElementos();
		}
		return cantidad;
	}
	
	public void eliminar(Musica m) {
		if (elementos.contains(m)){
			elementos.remove(m);
		}
	}
}
