package sicimi.api;

import java.util.List;

import sicimi.api.persistence.AskFor;

import sicimi.api.persistence.hibernate.Sicammtipo;

public class SearchTipo {
	private AskFor askFor;
	private List<Sicammtipo> allTipo;
	
	public SearchTipo() {
		this.askFor = new AskFor();
	}

	public void runAll() {
		allTipo = askFor.tipi();
	}
	
	public List<Sicammtipo> result() {
		return allTipo;
	}
	

}
