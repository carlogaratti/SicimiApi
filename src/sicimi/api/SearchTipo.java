package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;

import sicimi.api.persistence.hibernate.Sicammtipo;

public class SearchTipo {
	private AskFor askFor;
	private List<Object> list;

	public SearchTipo() {
		this.askFor = new AskFor();
	}

	public void runAll() {
		list = askFor.exec("allTipo", new HashMap<String, Object>());
		
	}
	
	public List<Sicammtipo> result() {
		List<Sicammtipo> listTipo = new ArrayList<Sicammtipo>();
		for (Object anElement : list) {
			listTipo.add((Sicammtipo)anElement);
			
		}
		return listTipo;
	}
	

}
