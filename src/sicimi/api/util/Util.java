package sicimi.api.util;

import java.util.List;

import sicimi.api.persistence.hibernate.Sicammcommesse;

public class Util {
	
	private Object[][] result;

	public  Object[][] asArrayofArray(List<Sicammcommesse> list, int columns) {
		result = new Object[list.size()][columns];
		Object[] singleRow = null;
		int rowCount = list.size() - 1;
		for (Sicammcommesse sicammcommesse : list) {
				singleRow = new Object[columns];
				singleRow[0] = sicammcommesse.getSacevasa();
				singleRow[1] = sicammcommesse.getSaccommessa();
				singleRow[2] = sicammcommesse.getSacdata();
				singleRow[3] = sicammcommesse.getSacdescrizione();
				result[rowCount] = singleRow;
				rowCount--;
		}
		return result;
	}
}
