package sicimi.api.persistence;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.util.HibernateUtil;



public class Database {
	
	private HibernateUtil hibernateUtil;
	private static SessionFactory factory;


	public Database() {
		this.hibernateUtil = new HibernateUtil();
		factory = hibernateUtil.getSessionFactory();
	}
	
	public static final String allCommesse = " select commesse from Sicammcommesse commesse join fetch commesse.sicammaziende  join fetch commesse.sicammtipo "+
			   " where year(sacdata) = :year and " + 
			   " (:satId is null or commesse.sicammtipo.satid = :satId ) and" +
			   " (:saaId is null or commesse.sicammaziende.saaid = :saaId ) and" +
			   " (:evasa is null or commesse.sacevasa = :evasa ) ";
	


	public List<Sicammcommesse> allCommesse(Map<String, Object> mapParameters) {
		Session session = factory.openSession(); // not thread safe, do not open for a long time..
		Query data = session.createQuery(allCommesse);
		setupQueryParameters(mapParameters, data);
		List<Sicammcommesse> result = data.list();
		session.close();
		return result;
	}



	private void setupQueryParameters(Map<String, Object> mapParameters,
			Query data) {
		Set<String> parameters = mapParameters.keySet();
		for (String aParameter : parameters) {
			data.setParameter(aParameter, mapParameters.get(aParameter));
		}
	}
}
