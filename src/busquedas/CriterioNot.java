package busquedas;

import base.Pista;

public class CriterioNot implements Criterio{
	private Criterio criterio;

	public CriterioNot(Criterio c) {
		this.criterio = c;
	}
	
	public boolean cumple(Pista p) {
		return (!this.criterio.cumple(p));
	}

}
