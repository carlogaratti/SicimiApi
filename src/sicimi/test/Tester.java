package sicimi.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.SearchCliente;
import sicimi.api.SearchCommesse;
import sicimi.api.SearchTipo;
import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.persistence.hibernate.Sicammtipo;


public class Tester {
	
	public static void main(String[] args) {
		searchCommesse();
		searchCommesseWithMap();
		//searchTipo();
		//searchCliente();
		
	}

	private static void searchCliente() {
		SearchCliente tipo = new SearchCliente();
		List<Sicammaziende> list = null;
		try {
			tipo.runAll();
			list = tipo.result();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Sicammaziende sicammaziende : list) {
			System.out.println(sicammaziende.getSaaragionesociale());
			System.out.println(sicammaziende.getSaaid());
		}
		
	}

	private static void searchCommesseWithMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("year", 2009);
		params.put("satId", "5");
		params.put("evasa", null);
		params.put("saaId", "746");
		params.put("sacdescrizione", null);
		SearchCommesse searchCommesse = new SearchCommesse();
		List<Sicammcommesse> list = null;
		try {
				searchCommesse.runWithAll(params);
				list = searchCommesse.result();
			for (Sicammcommesse sicammcommesse : list) {
				System.out.println(sicammcommesse.getSacdescrizione());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void searchTipo() {
		SearchTipo searchTipo = new SearchTipo();
		searchTipo.runAll();
		List<Sicammtipo> list = searchTipo.result();
		for (Sicammtipo sicammtipo : list) {
			System.out.println(sicammtipo.getSatid());
			System.out.println(sicammtipo.getSattipo() + " " + sicammtipo.getSatnote());
		}
		
	}

	private static void searchCommesse() {
		SearchCommesse searchCommesse = new SearchCommesse();
		List<Sicammcommesse> result = null;
		try {
			searchCommesse.runWhitYear(2009);
			result = searchCommesse.result();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			System.out.println("hi hi " + e.msg());;
		}
	}

}
