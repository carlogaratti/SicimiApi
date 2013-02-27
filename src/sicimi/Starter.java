package sicimi;

import sicimi.api.Commesse;

public class Starter {
	
	public static void main(String[] args) {
		Commesse commesse = new Commesse();
		Object[][] result = commesse.search(2009, "1", 746, new Boolean(true));
		System.out.println(result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][1]);
		}
	}

}
