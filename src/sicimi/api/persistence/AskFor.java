package sicimi.api.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sicimi.api.exception.ApiException;
import sicimi.api.persistence.hibernate.Sicammaziende;
import sicimi.api.persistence.hibernate.Sicammcommesse;
import sicimi.api.persistence.hibernate.Sicammtipo;
import sicimi.api.persistence.hibernate.Siccomordini;
import sicimi.api.util.HibernateUtil;



public class AskFor {
	
	private HibernateUtil hibernateUtil;
	private static SessionFactory factory;
	private Map<String, String> queryMap = new HashMap<String, String>();
	private static final String allCommesse = " select commesse from Sicammcommesse commesse join fetch commesse.sicammaziende  join fetch commesse.sicammtipo "+
			   " where year(sacdata) = :year and" + 
			   " (:satId is null or commesse.sicammtipo.satid = :satId ) and" +
			   " (:saaId is null or commesse.sicammaziende.saaid = :saaId ) and" +
			   " (:evasa is null or commesse.sacevasa = :evasa ) and " +
			   " (:sacdescrizione is null or commesse.sacdescrizione like :sacdescrizione ) ";
	
	private static final String allTipo = "select tipo from Sicammtipo tipo";
	private static final String allCliente = " select aziende from Sicammaziende aziende " +
											" where saacatid = 12";
	private static final String ordinibyCommessa = " select ordini from Siccomordini ordini where ordini.scrcommessa = :scrcommessa";
	private static final String offertebyCommessaResult = " select offerta from Siccomofferte offerta join offerta.sicammcommesses commesse where commesse.sacid in (:sacid) ";
	private static final String ddtOutputbyCommessea = "select ddtOut from SiccomddtOut ddtOut where ddtOut.scdocommessa =:scdocommessa";
	private static final String ddtInputbyCommessaIdfirstStep = "select ddtInExtended from SiccomddtInExtended ddtInExtended where scdiecommessaid =:scdiecommessaid";
	private static final String ddtInputbyCommessaIdSecondStep = "select ddtIn from SiccomddtIn ddtIn where ddtIn.scdiid in :scdiid";
	private static final String fatturaClientibyCommessa = "select fattClienti from SiccomfattureClienti fattClienti join fattClienti.sicammcommesses commesse where commesse.sacid in (:sacid)";
	private static final String fatturaFornitoribyCommessa = "select fattFornitori from SiccomfattureFornitori fattFornitori join fattFornitori.sicammcommesses commesse where commesse.sacid in (:sacid)";
	private static final String numeriFabbricabyCommessa = "select numeriFabbrica from SictecnumeriFabbrica numeriFabbrica join numeriFabbrica.sicammcommesse commesse where commesse.sacid in (:sacid)";
	
	public AskFor() {
		this.hibernateUtil = new HibernateUtil();
		factory = HibernateUtil.getSessionFactory();
		queryMap.put("allCommesse", allCommesse);
		queryMap.put("allTipo", allTipo);
		queryMap.put("allCliente", allCliente);
		queryMap.put("ordinibyCommessa", ordinibyCommessa);
		queryMap.put("offertebyCommessaResult", offertebyCommessaResult);
		queryMap.put("ddtInputbyCommessaIdfirstStep", ddtInputbyCommessaIdfirstStep);
		queryMap.put("ddtInputbyCommessaIdSecondStep", ddtInputbyCommessaIdSecondStep);
		queryMap.put("fatturaClientibyCommessa", fatturaClientibyCommessa);
		queryMap.put("fatturaFornitoribyCommessa", fatturaFornitoribyCommessa);
		queryMap.put("ddtOutputbyCommessea", ddtOutputbyCommessea);
		queryMap.put("numeriFabbricabyCommessa", numeriFabbricabyCommessa);
	}
	
	public List<Sicammcommesse> commesse(Map<String, Object> mapParameters) throws ApiException {
		
		try {
			Session session = factory.openSession();	
			Query data = session.createQuery(allCommesse);
		    data = setupQueryParameters(mapParameters, data);
			List<Sicammcommesse> result = data.list();
			session.close();
			return result;
		} catch (Exception e) {
			Integer logNumber = log(allCommesse, mapParameters);
			throw new ApiException(e, allCommesse, logNumber);
		}
	}
	
	public List<Siccomordini> ordinibyCommessa(Integer commessa) {
		Session session = factory.openSession();	
		Query data = session.createQuery(ordinibyCommessa);
		data.setParameter("scrcommessa", commessa);
		List<Siccomordini> result = data.list();
		session.close();
		return result;
}
	
	public List<Sicammaziende> clienti() {
			Session session = factory.openSession();	
			Query data = session.createQuery(allCliente);
			List<Sicammaziende> result = data.list();
			session.close();
			return result;
	}



	private Query setupQueryParameters(Map<String, Object> mapParameters, Query data) {
		Set<String> parameters = mapParameters.keySet();
		for (String aParameter : parameters) {
			try {
				data.setParameter(aParameter, mapParameters.get(aParameter));
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}
	
	public static int log(String sql, Map parameters){
		Session session = factory.openSession();
		session.beginTransaction();
		Query data = session.createSQLQuery("select max(idSICAMMLog) from SICAMMLog");
		int pk = new Integer((Integer)data.list().get(0)) + 1 ;
		Query query = session.createSQLQuery("insert into SICAMMLog(idSICAMMLog, sqlExecuted, parametri) " +  "values (?,?,?)");
		query.setInteger(0, pk);
		query.setString(1, sql.substring(0, sql.length() - 1));
		query.setString(2, parameters.toString().substring(0, parameters.toString().length()));
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return pk;
	}
	
	//new 
	public List<Object> exec(String query, Map<String, Object> mapParameters){
		Session session = factory.openSession();	
		Query data = session.createQuery(queryMap.get(query));
	    data = setupQueryParameters(mapParameters, data);
		List<Object> result = (List<Object>)data.list();
		session.close();
		return result;
	}
	
	
	

	public List<Sicammtipo> tipi() {
		Session session = factory.openSession();
		Query data = session.createQuery(allTipo);
		List<Sicammtipo> result = data.list();
		session.close();
		return result;
	}
}
