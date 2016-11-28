package busquedas;

import base.Pista;

public class CriterioAnd implements Criterio {
	public Criterio criterio1;
	public Criterio criterio2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.criterio1 = c1;
		this.criterio2 = c2;
	}
	
	public boolean cumple(Pista p) {
		return (this.criterio1.cumple(p) && this.criterio2.cumple(p));
	}

	
}
