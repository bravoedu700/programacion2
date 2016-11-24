package busquedas;

import extraccion.Extractor;
import base.Pista;

public class CriterioParcial extends CriterioSimple{

	public CriterioParcial(Extractor ex, Object val) {
		super(ex, val);
	}

	public boolean cumple(Pista p) {
		return (((String) extr.get(p)).toLowerCase().contains(((String) valor).toLowerCase()));
	}
}
