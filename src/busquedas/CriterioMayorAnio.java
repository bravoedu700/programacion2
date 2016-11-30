package busquedas;

import base.Pista;

public class CriterioMayorAnio implements Criterio {

	protected int valor;
	
	public CriterioMayorAnio(int valor) {
		this.valor = valor;
	}

	public boolean cumple(Pista p) {
		return p.getAnio() > this.valor;
	}

}
