package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.hibernate.SiccomfattureFornitori;

public class SearchFattFornitori extends Search{
	
	public SearchFattFornitori() {
		super();
	}
	
	public void runByCommessa(Integer commessa) {
		setupParametersFor(commessa);
		list = askFor.exec("fatturaFornitoribyCommessa", mapParameters);
	}
	
	public List<SiccomfattureFornitori> result() {
		List<SiccomfattureFornitori> listFattureFornitori = new ArrayList<SiccomfattureFornitori>();
		for (Object anElement : list) {
			listFattureFornitori.add((SiccomfattureFornitori)anElement);	
		}
		return listFattureFornitori;
	}
	
	private void setupParametersFor(Integer commessa) {
		mapParameters.put("sacid", commessa);
	}

}
