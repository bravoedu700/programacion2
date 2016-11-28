package base;
import java.util.*;
import busquedas.Criterio;

public abstract class Musica {
	String nombre;
	public abstract int getDuracion();
	public abstract Vector<Pista> busqueda(Criterio c);
	public abstract int CantidadElementos();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
