package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.Anni;


public class SearchAnno {
	
	Anni _anni;
	
	public List<String> runAll() {
		List<String> list = new ArrayList<String>();
		for (Anni anAnno : _anni.values()) {
			list.add(anAnno.getValue());
		}
		return list;
	}

}
