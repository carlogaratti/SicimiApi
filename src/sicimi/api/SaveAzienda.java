package sicimi.api;

import org.hibernate.HibernateException;

import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammindirizzi;
import sicimi.api.service.AskFor;

public class SaveAzienda {

	private Sicammaziende _sicamaziende;
	private Sicammindirizzi _sicamindirizzi;

	public SaveAzienda(Sicammaziende sicamaziende,
			Sicammindirizzi sicamindirizzi) {
		this._sicamaziende = sicamaziende;
		this._sicamindirizzi = sicamindirizzi;

	}
	
	public String run(){
		String result = "OK";
		AskFor ask = new AskFor();
		try {
			ask.begin();
			ask.save(_sicamaziende);
			ask.save(_sicamindirizzi);
			ask.close();
		} catch (HibernateException e) {
			return "KO"; 
		}
		return result;
	}

}
