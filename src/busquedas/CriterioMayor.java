package busquedas;

import extraccion.Extractor;
import base.Pista;

public class CriterioMayor extends CriterioSimple{
	
	public CriterioMayor(Extractor ex, Object val) {
		super(ex, val);
	}

	public boolean cumple(Pista p) {
		return (int)extr.get(p) > (int)this.valor;
	}


}
