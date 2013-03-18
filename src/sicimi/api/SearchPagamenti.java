package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import sicimi.api.persistence.hibernate.Sicammcategorie;
import sicimi.api.persistence.hibernate.Sicammpagamenti;

public class SearchPagamenti extends Search{
	
	public void run() {
		list = askFor.exec("pagamenti", new HashMap<String, Object>());
	}

	@Override
	public List result() {
		List<Sicammpagamenti> categorie = new ArrayList<Sicammpagamenti>();
		for (Object sicammcategorie : list) {
			categorie.add((Sicammpagamenti)sicammcategorie);
		}
		
		return categorie;
	}

	public static void main(String[] args) {
		
	}

}
