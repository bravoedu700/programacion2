package busquedas;

import base.Pista;

public class CriterioParcialGenero implements Criterio {

	String genero;
	
	public CriterioParcialGenero(String genero){
		this.genero = genero;
	}
	
	public boolean cumple(Pista p) {
		return (p.getGenero().toLowerCase().contains(this.genero.toLowerCase()));
	}

}
