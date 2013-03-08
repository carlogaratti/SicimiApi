package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Siccomofferte;

public class SearchOfferte {
	private AskFor askFor;
	private List<Object> list;
	private HashMap<String, Object> mapParameters;
	
	public SearchOfferte() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
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
