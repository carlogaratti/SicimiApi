package sicimi.api;

import java.util.List;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Sicammaziende;

public class SearchCliente {
private AskFor askFor;
private List<Sicammaziende> listCliente;
	
	public SearchCliente() {
		this.askFor = new AskFor();
	}

	public void runAll() throws ApiException {
		listCliente = askFor.clienti();
	}
	
	public List<Sicammaziende> result() {
		return listCliente;
	}

}
