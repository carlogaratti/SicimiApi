package sicimi.api;

import java.util.Iterator;
import java.util.List;

import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.util.*;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

public class Commesse {
	public static final String query = " select commesse from Sicammcommesse commesse join fetch commesse.sicammaziende  join fetch commesse.sicammtipo"+
									   " where year(sacdata) = :data and " + 
									   " (:satId is null or commesse.sicammtipo.satid ) and" +
									   " (:saaId is null or commesse.sicammaziende.saaid = :saaId ) and" +
									   " (:evasa is null or commesse.sacevasa = :evasa ) ";
	
	private Object[][] result;

	private Util util;
	public static final int columns = 4;
	
	public Commesse() {
		this.util = new Util();
	}

	
	public Object[][] search(int year, String satId, int saaId, Boolean evasa){
		SessionFactory factory = HibernateUtil.getSessionFactory();// thread safe, one for application and database
		Session session = factory.openSession(); // not thread safe, do not open for a long time..
		session.beginTransaction();
		Query data = session.createQuery(query);
		data.setParameter("data", year);
		data.setParameter("satId", satId);
		data.setParameter("saaId", saaId);
		data.setParameter("evasa", evasa);
		List<Sicammcommesse> list = data.list();
		session.getTransaction().commit();
		return util.asArrayofArray(list, columns);

	}

}