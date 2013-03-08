package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Sicammaziende;

public class SearchCliente {
private AskFor askFor;
private List<Object> list;
	
	public SearchCliente() {
		this.askFor = new AskFor();
	}

	public void runAll() throws ApiException {
		list = askFor.exec("allCliente", new HashMap<String, Object>());
	}
	
	public List<Sicammaziende> result() {
		List<Sicammaziende> listClienti = new ArrayList<Sicammaziende>();
		for (Object anElement : list) {
			listClienti.add((Sicammaziende)anElement);
			
		}
		return listClienti;
	}

}
