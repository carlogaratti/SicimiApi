package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.hibernate.Siccomordini;

public class SearchOrdini extends Search{
	
	public SearchOrdini() {
		super();
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
