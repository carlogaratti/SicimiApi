package sicimi.api.exception;

import java.util.Map;

import javax.xml.crypto.Data;



public class ApiException extends Exception {

	private Throwable exception;
	private String sql;
	private Integer logNumber;
	private boolean dbLog = true;

	
	public ApiException(Throwable e, String allcommesse, Integer logNumber) {
		this.exception = e;
		this.sql = allcommesse;
		this.logNumber = logNumber;
	}

	public String msg() {	
		return  " LogNumber " + logNumber;
	}

}
