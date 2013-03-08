package sicimi.api;

import java.util.ArrayList;
import java.util.List;

import sicimi.api.persistence.hibernate.SiccomddtOut;

public class SearchDDTOut extends Search{

		public SearchDDTOut() {
			super();
		}
		
		public void runByCommessa(Integer commessa) {
			setupParametersFor(commessa);
			list = askFor.exec("ddtOutputbyCommessea", mapParameters);	
		}
		
		public List<SiccomddtOut> result() {
			List<SiccomddtOut> listddtOut = new ArrayList<SiccomddtOut>();
			for (Object anElement : listddtOut) {
				listddtOut.add((SiccomddtOut)anElement);
			}
			return listddtOut;
		}
		
		private void setupParametersFor(Integer commessa) {
			mapParameters.put("scdocommessa", commessa);
		}

}
