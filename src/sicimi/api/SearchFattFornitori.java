package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.SiccomfattureFornitori;

public class SearchFattFornitori {
	private AskFor askFor;
	private List<Object> list;
	private HashMap<String, Object> mapParameters;
	
	public SearchFattFornitori() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
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
