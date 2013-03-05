package sicimi.api;

import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.persistence.hibernate.Siccomordini;

public class SearchOrdini {
	private AskFor askFor;
	private List<Siccomordini> listOrdini;
	
	public SearchOrdini() {
		this.askFor = new AskFor();
	}
	
	public void runByCommessa(Integer commessa) {
		listOrdini = askFor.ordinibyCommessa(commessa);
		
	}
	
	public List<Siccomordini> result() {
		return listOrdini;
		
	}
}
