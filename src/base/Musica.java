package base;
import java.util.*;
import busquedas.Criterio;

public abstract class Musica {
	String nombre;
	
	public abstract String getInterprete();
	public abstract int getDuracion();
	public abstract int getAnio();
	public abstract String getGenero();
	public abstract String getAlbum();
	public abstract Vector<Pista> busqueda(Criterio c);
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String mostrarDuracion(){
		return ("Duracion de " + this.nombre + ": " + this.getDuracion());
	}
}
