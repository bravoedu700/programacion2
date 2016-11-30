package busquedas;

import base.Pista;

public class CriterioParcialNombre implements Criterio {
	
	protected String nombre;
	
	public CriterioParcialNombre(String nombre){
		this.nombre = nombre;
	}
	
	public boolean cumple(Pista p) {
		return (p.getNombre().toLowerCase().contains(this.nombre.toLowerCase()));
	}

}
