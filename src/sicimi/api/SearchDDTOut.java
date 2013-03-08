package sicimi.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sicimi.api.persistence.AskFor;
import sicimi.api.persistence.hibernate.SiccomddtOut;

public class SearchDDTOut {

		private AskFor askFor;
		private List<Object> list;
		private HashMap<String, Object> mapParameters;
		
		public SearchDDTOut() {
			this.askFor = new AskFor();
			mapParameters = new HashMap<String, Object>();
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
