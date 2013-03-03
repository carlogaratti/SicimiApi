package sicimi.api;

import java.util.ArrayList;
import java.util.List;


public class SearchAnno {
	
	public List<String> runAll() {
		List<String> list = new ArrayList<String>();
		String[] aString = new String[]{"2013", "2012", "2011", "2010", "2009"};
		for (int i = 0; i < aString.length; i++) {
			list.add(aString[i]);
		}
		return list;
		
	}

}
