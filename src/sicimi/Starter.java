package sicimi;

import java.util.List;

import sicimi.api.SearchCommesse;
import sicimi.api.persistence.hibernate.Sicammcommesse;


public class Starter {
	
	public static void main(String[] args) {
		SearchCommesse commesse = new SearchCommesse();
		List<Sicammcommesse> result = commesse.run(2009, "1", null, null);
		System.out.println(result.size());
		for (Sicammcommesse sicammcommesse : result) {
			System.out.println(sicammcommesse.getSacdescrizione());
		}
		
	}

}
