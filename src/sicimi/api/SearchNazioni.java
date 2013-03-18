package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.persistence.hibernate.Sictecnazioni;

public class SearchNazioni extends Search{
	
	public SearchNazioni() {
		super();
	}
	
	public void run() {
		list = askFor.exec("nazioni", new HashMap<String, Object>());
	}
	
	@Override
	public List<Sictecnazioni> result() {
		List<Sictecnazioni> nazioni = new ArrayList<Sictecnazioni>();
		for (Object sictecnazioni : list) {
			nazioni.add((Sictecnazioni)sictecnazioni);
		}
		return nazioni;
	}

}
