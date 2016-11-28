package busquedas;

import base.Pista;

public class CriterioParcialInterprete implements Criterio {

	String interprete;
	
	public CriterioParcialInterprete(String interprete){
		this.interprete = interprete;
	}
	
	public boolean cumple(Pista p) {
		return (p.getInterprete().toLowerCase().contains(this.interprete.toLowerCase()));
	}

}
