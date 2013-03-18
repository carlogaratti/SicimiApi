package sicimi.test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sicimi.api.SaveAzienda;
import sicimi.api.SearchAnno;
import sicimi.api.SearchCliente;
import sicimi.api.SearchCommesse;
import sicimi.api.SearchDDTIn;
import sicimi.api.SearchDDTOut;
import sicimi.api.SearchFattFornitori;
import sicimi.api.SearchFattureCliente;
import sicimi.api.SearchNazioni;
import sicimi.api.SearchNumeriFabbrica;
import sicimi.api.SearchOfferte;
import sicimi.api.SearchOrdini;
import sicimi.api.SearchPagamenti;
import sicimi.api.SearchTipo;
import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammcategorie;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.persistence.hibernate.Sicammindirizzi;
import sicimi.api.persistence.hibernate.Sicammpagamenti;
import sicimi.api.persistence.hibernate.Sicammtipo;
import sicimi.api.persistence.hibernate.SiccomddtOut;
import sicimi.api.persistence.hibernate.Siccomofferte;
import sicimi.api.persistence.hibernate.Sictecnazioni;
import sicimi.api.service.AskFor;


public class Tester {
	
	public static void main(String[] args) {
		
//		searchCommesse();
//		searchCommesseWithMap();
//		searchTipo();
//		searchCliente();
//		searchOrdiniByCommessa();
//		searchOffertaByCommessa();
//		searchDDTOutByCommessa();
//		searchddtInByCommessa();
//		searchFattureClienteByCommessa();
//		serachFattureFornitoriByCommessa();
//		serachNumeriFabbricabyId();
//		searchNazioni();
	//	searchPagamenti();
	//	saveAzienda();
		searchAnno();
		
		
		
	}

	private static void searchAnno() {
		SearchAnno anno = new SearchAnno();
		List<String> list = anno.runAll();
		for (String aString : list) {
			System.out.println(aString);
		}
		
	}

	private static void searchPagamenti() {
		SearchPagamenti pagamenti = new SearchPagamenti();
		pagamenti.run();
		List<Sicammpagamenti> list = pagamenti.result();
		for (Sicammpagamenti sicampagamenti : list) {
			System.out.println(sicampagamenti.getSappagamento());
		}
		
	}

	private static void searchNazioni() {
		SearchNazioni nazioni = new SearchNazioni();
		nazioni.run();
		List<Sictecnazioni> list = nazioni.result();
		for (Sictecnazioni sictecnazioni : list) {
			System.out.println(sictecnazioni.getStnnazione());
		}
		
	}

	private static void saveAzienda() {
		
		Sicammaziende sicamaziende = new Sicammaziende();
		sicamaziende.setSaaragionesociale("Test");
		
		Sicammindirizzi sicamindirizzi = new Sicammindirizzi();
		sicamindirizzi.setSaiindirizzo("indirizzoTest");
		sicamindirizzi.setSaicap("21015");
		sicamindirizzi.setSaicitta("Citta test");
		sicamindirizzi.setSaiprovincia("Varese");
		//sicamindirizzi.setSictecnazioni(77);
		sicamindirizzi.setSicammaziende(sicamaziende);
		
		
		
		
		
		
		SaveAzienda saveAzienda = new SaveAzienda(sicamaziende, sicamindirizzi);
		System.out.println(saveAzienda.run());
		
		
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
		//params.put("startDate", null);
		//params.put("endDate", null);
		//params.put("sacdataconsegna", null);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 11, 9); //year is as expected, month is zero based, date is as expected	
		params.put("startDate", cal.getTime());
		cal.clear();
		cal.set(2011, 1, 23);
		params.put("endDate", cal.getTime());
		params.put("sacdataconsegna", new Date());
		SearchCommesse searchCommesse = new SearchCommesse();
		List<Sicammcommesse> list = null;
		try {
				searchCommesse.runWithAll(params);
				list = searchCommesse.result();
			for (Sicammcommesse sicammcommesse : list) {
				System.out.println(sicammcommesse.getSacdataconsegna());
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
