package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.service.AskFor;


public class SearchCommesse extends Search{

	
	public SearchCommesse() {
		super();
	}
	
	public void runWhitYear(Integer year) throws ApiException{
		setupParametersFor(year);
		list = askFor.exec("allCommesse", mapParameters);

	}
	
	public void runWithAll(Map<String, Object> map) throws ApiException {
		list = askFor.exec("allCommesse", map);
	}
	
	public List<Sicammcommesse> result() {
		List<Sicammcommesse> listCommesse = new ArrayList<Sicammcommesse>();
		for (Object anElement : list) {
			listCommesse.add((Sicammcommesse)anElement);
			
		}
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