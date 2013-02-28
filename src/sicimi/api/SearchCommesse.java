package sicimi.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.persistence.Database;
import sicimi.api.persistence.hibernate.Sicammcommesse;


public class SearchCommesse {

	private Database database;
	private HashMap<String, Object> mapParameters;
	
	public SearchCommesse() {
		this.database = new Database();
		mapParameters = new HashMap<String, Object>();
	}
	public List<Sicammcommesse> run(Integer year, String satId, Integer saaId, Boolean evasa){
		mapParameters.put("year", year);
		mapParameters.put("satId", satId);
		mapParameters.put("saaId", saaId);
		mapParameters.put("evasa", evasa);
		return  database.allCommesse(mapParameters);

	}
}