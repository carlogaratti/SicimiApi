package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

public class AnnoLookup {
	public List<String> run() {
		List<String> list = new ArrayList<String>();
		String[] aString = new String[]{"2013", "2012", "2011", "2010", "2009"};
		for (int i = 0; i < aString.length; i++) {
			list.add(aString[i]);
		}
		return list;
		
	}

}
