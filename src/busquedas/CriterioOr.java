package busquedas;

import base.Pista;

public class CriterioOr implements Criterio{
	
	protected Criterio criterio1;
	protected Criterio criterio2;
	
	public CriterioOr(Criterio c1, Criterio c2) {
		this.criterio1 = c1;
		this.criterio2 = c2;
	}
	
	public boolean cumple(Pista p) {
		return (this.criterio1.cumple(p) || this.criterio2.cumple(p));
	}
	
}
