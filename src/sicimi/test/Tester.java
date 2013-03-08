package sicimi.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sicimi.api.SearchCliente;
import sicimi.api.SearchCommesse;
import sicimi.api.SearchDDTIn;
import sicimi.api.SearchDDTOut;
import sicimi.api.SearchFattFornitori;
import sicimi.api.SearchFattureCliente;
import sicimi.api.SearchNumeriFabbrica;
import sicimi.api.SearchOfferte;
import sicimi.api.SearchOrdini;
import sicimi.api.SearchTipo;
import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.persistence.hibernate.Sicammtipo;
import sicimi.api.persistence.hibernate.SiccomddtOut;
import sicimi.api.persistence.hibernate.Siccomofferte;


public class Tester {
	
	public static void main(String[] args) {
		
		searchCommesse();
		searchCommesseWithMap();
		searchTipo();
		searchCliente();
		searchOrdiniByCommessa();
		searchOffertaByCommessa();
		
		searchDDTOutByCommessa();
		
		searchddtInByCommessa();
		searchFattureClienteByCommessa();
		serachFattureFornitoriByCommessa();
		
		serachNumeriFabbricabyId();
		
	}

	private static void serachNumeriFabbricabyId() {
		SearchNumeriFabbrica sf = new SearchNumeriFabbrica();
		sf.runByCommessa(105);
		System.out.println(sf.result().size());
		
	}

	private static void serachFattureFornitoriByCommessa() {
		SearchFattFornitori sf = new SearchFattFornitori();
		sf.runByCommessa(105);
		System.out.println(sf.result().size());
		
	}

	private static void searchFattureClienteByCommessa() {
		SearchFattureCliente sf = new SearchFattureCliente();
		sf.runByCommessa(105);
		System.out.println(sf.result().size());
		
	}

	private static void searchddtInByCommessa() {
		SearchDDTIn ddt = new SearchDDTIn();
		ddt.runByCommessa(105);
		ddt.result();
	}

	private static void searchDDTOutByCommessa() {
		SearchDDTOut ddtOut = new SearchDDTOut();
		ddtOut.runByCommessa(917);
		ddtOut.result();
		for (SiccomddtOut aDdt : ddtOut.result()) {
			System.out.println(aDdt.getScdotrasportocura());
		}
		
	}

	private static void searchOffertaByCommessa() {
		SearchOfferte so = new SearchOfferte();
		so.runByCommessa(105);
		for (Siccomofferte anOffer : so.result()) {
			System.out.println(anOffer.getScoofferta());
		}
		
	}

	private static void searchOrdiniByCommessa() {
		SearchOrdini searchOrdini = new SearchOrdini();
		searchOrdini.runByCommessa(18);
		System.out.println(searchOrdini.result().size());
		
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
		try {
			searchCommesse.runWhitYear(2009);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			System.out.println("hi hi " + e.msg());;
		}
	}

}
