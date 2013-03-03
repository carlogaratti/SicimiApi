package sicimi.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.Sicammcommesse;


public class SearchCommesse {

	private AskFor askFor;
	private HashMap<String, Object> mapParameters;
	private List<Sicammcommesse> listCommesse;
	
	public SearchCommesse() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
	}
	
	public void runWhitYear(Integer year) throws ApiException{
		setupParametersFor(year);
		listCommesse = askFor.commesse(mapParameters);

	}
	
	public void runWithAll(Map<String, Object> map) throws ApiException {
		listCommesse = askFor.commesse(map);
	}
	
	public List<Sicammcommesse> result(){
		return listCommesse;
	}
	
	private void setupParametersFor(Integer year) {
		mapParameters.put("year", year);
		mapParameters.put("satId", null);
		mapParameters.put("saaId", null);
		mapParameters.put("evasa", null);
		mapParameters.put("sacdescrizione", null);
	}
	
	
}