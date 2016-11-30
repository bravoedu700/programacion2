package base;

import java.util.*;

import busquedas.Criterio;

public class PlayListSimple extends Musica {
	
	protected Vector <Musica> elementos = new Vector<Musica>();

	public PlayListSimple(String nom) {
		super.nombre = nom;
	}

	public Vector<Musica> getElementos() {
		return this.elementos;
	}

	public void addElemento (Musica m){
		this.elementos.add(m);
	}
	
	public Vector<Pista> busqueda(Criterio c){
		Vector <Pista> pistas = new Vector<Pista>();
		Vector <Pista> pistasRetornados = new Vector<Pista>();
		for(Enumeration<Musica> e = this.elementos.elements(); e.hasMoreElements();){
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
		String msj = this.getNombre()+"\n";
		for (int i=0; i < this.elementos.size(); i++)
			msj += this.elementos.elementAt(i).toString() + "\n";
		return msj;
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
	
	public boolean equals(Object obj){
		if (obj instanceof PlayListSimple) 
		{
			PlayListSimple p = (PlayListSimple) obj;
        	if(p.getNombre().equals(this.getNombre())){
        		Vector<Musica> elementos = p.getElementos();
        		if(elementos.equals(this.getElementos()))
        			return true;
        		else
        			return false;
            }
        	else
        		return false;
        } 
        else { 
        	return false; 
        }		
	}
	
	public void eliminarElemento(Musica m) {
		if (elementos.contains(m)){
			elementos.remove(m);
		}
	}
}
