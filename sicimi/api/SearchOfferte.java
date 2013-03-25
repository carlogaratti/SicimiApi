package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.hibernate.Siccomofferte;

public class SearchOfferte extends Search{

	
	public SearchOfferte() {
		super();
	}
	
	public void runByCommessa(Integer commessa) {
		setupParametersFor(commessa);
		list = askFor.exec("offertebyCommessaResult", mapParameters);
	}
	
	public List<Siccomofferte> result() {
		List<Siccomofferte> listOfferte = new ArrayList<Siccomofferte>();
		for (Object anElement : list) {
			listOfferte.add((Siccomofferte)anElement);
		}
		return listOfferte;
	}
	
	private void setupParametersFor(Integer commessa) {
		mapParameters.put("sacid", commessa);
	}

}
