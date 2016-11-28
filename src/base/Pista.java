package base;

import java.util.*;

import busquedas.Criterio;

public class Pista extends Musica{
	int id;
	int duracion;
	String interprete;
	String album;
	String genero;
	String comentarios;
	int anio;
	
	public Pista(int num, int dur, String inte, String alb, String gen, String com, int an, String nom) {
		id = num;
		duracion = dur;
		interprete = inte;
		album = alb;
		genero = gen;
		comentarios = com;
		anio = an;
		nombre = nom;
	}
	
	public int getId(){
		return id;
	}

	public String getInterprete() {
		return interprete;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getAnio() {
		return anio; 
	}

	public String getGenero() {
		return genero;
	}

	public String getAlbum() {
		return album;
	}
	
	public String getNombre() {
		return nombre;
	}
		
	public String toString(){
		
		return ( this.getId() + " - " + this.getNombre() + " - " + this.getInterprete() + " - " +this.getAlbum() + " - ("+this.getGenero()+", "+this.getAnio()+") - " +this.getDuracion());

	}
	
	public Vector<Pista> busqueda(Criterio c){
		Vector <Pista> pistas = new Vector<Pista>();
		if (c.cumple(this))
		{
			pistas.addElement(this);
		}
		return pistas;
	}
	
	public boolean equals (Object obj) {
        if (obj instanceof Pista) {
        	Pista auxPista = (Pista) obj;
            if (this.getNombre().equals(auxPista.getNombre()) && 
        		this.getAlbum().equals(auxPista.getAlbum()) && 
        		this.getAnio() == auxPista.getAnio() && 
        		this.getDuracion() == auxPista.getDuracion() && 
        		this.getGenero().equals(auxPista.getGenero()) && 
        		this.getInterprete().equals(auxPista.getInterprete())
        		){
            		return true; 
            	} 
            	else { 
            		return false; 
            	}
        } 
        else { 
        	return false; 
        }
	}
	
	
	public void setDuracion (int d){
		duracion = d;
	}
	
	public void setInterprete(String i){
		interprete = i;
	}
	
	public void setAlbum(String a){
		album = a;
	}
	
	public void setAnio(int a){
		anio = a;
	}
	
	public void setGenero(String g){
		genero = g;
	}


	public int CantidadElementos() {
		return 1;
	}
}
