package base;
import java.util.*;
import busquedas.Criterio;

public abstract class Musica {
	protected String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	public abstract int getDuracion();
	
	public abstract Vector<Pista> busqueda(Criterio c);
	
	public abstract int cantidadElementos();
	
}
