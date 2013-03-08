package sicimi.api;

import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;

public abstract class Search {
	
	protected AskFor askFor;
	protected List<Object> list;
	protected HashMap<String, Object> mapParameters;
	
	public Search() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
	}
	
	public  abstract List result();

}
