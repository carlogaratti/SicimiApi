package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.SiccomddtIn;
import sicimi.api.persistence.hibernate.SiccomddtInExtended;

public class SearchDDTIn extends Search{
	
	private List<SiccomddtIn> result;

	public void runByCommessa(Integer commessa) {
		result = new ArrayList<SiccomddtIn>();
		AskFor ask = new AskFor();
		Map<String, Object> mapParameters = new HashMap<String, Object>();
		mapParameters.put("scdiecommessaid", commessa);
		List<Object> list = ask.exec("ddtInputbyCommessaIdfirstStep", mapParameters);
		
		for (Object object : list) {
			Integer anInt = ((SiccomddtInExtended)object).getId().getScdieddtinid();
			mapParameters.clear();
			mapParameters.put("scdiid", anInt);
			List<Object> lista = ask.exec("ddtInputbyCommessaIdSecondStep", mapParameters);
			result.add((SiccomddtIn)lista.get(0));
		}
		for (SiccomddtIn anElement : result) {
			System.out.println(anElement.getScdifattura());
		}

	}
	
	public List<SiccomddtIn> result() {
		return result;
		
	}
	
}
