package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Siccomordini;

public class SearchOrdini {
	private AskFor askFor;
	private List<Object> list;
	private HashMap<String, Object> mapParameters;
	
	public SearchOrdini() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
	}
	
	public void runByCommessa(Integer commessa) {
		setupParametersFor(commessa);
		list = askFor.exec("ordinibyCommessa", mapParameters);
		
	}
	
	public List<Siccomordini> result() {
		List<Siccomordini> listOrdini = new ArrayList<Siccomordini>();
		for (Object anElement : list) {
			listOrdini.add((Siccomordini)anElement);
			
		}
		return listOrdini;
	}
	
	private void setupParametersFor(Integer commessa) {
		mapParameters.put("scrcommessa", commessa);
	}
	
}
