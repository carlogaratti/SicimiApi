package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.SiccomddtOut;
import sicimi.api.persistence.hibernate.SiccomfattureClienti;

public class SearchFattureCliente {
	private AskFor askFor;
	private List<Object> list;
	private HashMap<String, Object> mapParameters;
	
	public SearchFattureCliente() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
	}
	
	public void runByCommessa(Integer commessa) {
		setupParametersFor(commessa);
		list = askFor.exec("fatturaClientibyCommessa", mapParameters);
		
	}
	
	public List<SiccomfattureClienti> result() {
		List<SiccomfattureClienti> listFattureCliente = new ArrayList<SiccomfattureClienti>();
		for (Object anElement : list) {
			listFattureCliente.add((SiccomfattureClienti)anElement);
			
		}
		return listFattureCliente;
	}
	
	private void setupParametersFor(Integer commessa) {
		mapParameters.put("sacid", commessa);
	}

}
