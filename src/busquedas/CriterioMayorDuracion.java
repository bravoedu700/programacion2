package busquedas;
import base.Pista;

public class CriterioMayorDuracion implements Criterio {

	protected int valor;
	
	public CriterioMayorDuracion(int valor) {
		this.valor = valor;
	}

	public boolean cumple(Pista p) {
		return p.getDuracion() > this.valor;
	}

}
