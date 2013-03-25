package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammaziende;

public class SearchAziende extends Search{
	
	public SearchAziende() {
		super();
	}


	public void runAll(int tipoAzienda) throws ApiException {
		setupParametersFor(tipoAzienda);
		list = askFor.exec("allAziende", mapParameters);
	}
	
	public List<Sicammaziende> result() {
		List<Sicammaziende> listClienti = new ArrayList<Sicammaziende>();
		for (Object anElement : list) {
			listClienti.add((Sicammaziende)anElement);
			
		}
		return listClienti;
	}
	
	private void setupParametersFor(Integer tipoAzienda) {
		mapParameters.put("saacatid", tipoAzienda);
	}

}
