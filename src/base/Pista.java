package base;

import java.util.*;

import busquedas.Criterio;

public class Pista extends Musica{
	protected int id;
	protected int duracion;
	protected String interprete;
	protected String album;
	protected String genero;
	protected String comentarios;
	protected int anio;
	
	public Pista(int num, int dur, String inte, String alb, String gen, String com, int an, String nom) {
		this.id = num;
		this.duracion = dur;
		this.interprete = inte;
		this.album = alb;
		this.genero = gen;
		this.comentarios = com;
		this.anio = an;
		super.nombre = nom;
	}
	
	public int getId(){
		return this.id;
	}

	public String getInterprete() {
		return this.interprete;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public int getAnio() {
		return this.anio; 
	}

	public String getGenero() {
		return this.genero;
	}

	public String getAlbum() {
		return this.album;
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
	
	public Vector<Pista> busqueda(Criterio c){
		Vector <Pista> pistas = new Vector<Pista>();
		if (c.cumple(this))
		{
			pistas.addElement(this);
		}
		return pistas;
	}

	
	public int cantidadElementos() {
		return 1;
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
		
	public String toString(){		
		return ( this.getId() + " - " + this.getNombre() + " - " + this.getInterprete() + " - " +this.getAlbum() + " - ("+this.getGenero()+", "+this.getAnio()+") - " +this.getDuracion());
	}
}
