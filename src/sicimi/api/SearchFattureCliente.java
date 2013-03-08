package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.hibernate.SiccomfattureClienti;

public class SearchFattureCliente extends Search{
	
	public SearchFattureCliente() {
		super();
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
