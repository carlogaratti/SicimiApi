package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.SictecnumeriFabbrica;

public class SearchNumeriFabbrica {
	private AskFor askFor;
	private List<Object> list;
	private HashMap<String, Object> mapParameters;
	
	public SearchNumeriFabbrica() {
		this.askFor = new AskFor();
		mapParameters = new HashMap<String, Object>();
	}
	
	public void runByCommessa(Integer commessa) {
		setupParametersFor(commessa);
		list = askFor.exec("numeriFabbricabyCommessa", mapParameters);
		
	}
	
	public List<SictecnumeriFabbrica> result() {
		List<SictecnumeriFabbrica> listNumeriFabbrica = new ArrayList<SictecnumeriFabbrica>();
		for (Object anElement : list) {
			listNumeriFabbrica.add((SictecnumeriFabbrica)anElement);
			
		}
		return listNumeriFabbrica;
	}
	
	private void setupParametersFor(Integer commessa) {
		mapParameters.put("sacid", commessa);
	}

}
