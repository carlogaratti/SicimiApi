package sicimi.api.persistence.hibernate;

// Generated Mar 8, 2013 11:51:09 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SiccomddtIn generated by hbm2java
 */
@Entity
@Table(name = "SICCOMDdtIn", catalog = "Sicimi01")
public class SiccomddtIn implements java.io.Serializable {

	private int scdiid;
	private Sicammaziende sicammaziende;
	private Integer scdinsnumero;
	private String scdidata;
	private String scdinumero;
	private Integer scdifattura;
	private Byte scdicausale;
	private Boolean scdicaricato;
	private String scdinote;

	public SiccomddtIn() {
	}

	public SiccomddtIn(int scdiid) {
		this.scdiid = scdiid;
	}

	public SiccomddtIn(int scdiid, Sicammaziende sicammaziende,
			Integer scdinsnumero, String scdidata, String scdinumero,
			Integer scdifattura, Byte scdicausale, Boolean scdicaricato,
			String scdinote) {
		this.scdiid = scdiid;
		this.sicammaziende = sicammaziende;
		this.scdinsnumero = scdinsnumero;
		this.scdidata = scdidata;
		this.scdinumero = scdinumero;
		this.scdifattura = scdifattura;
		this.scdicausale = scdicausale;
		this.scdicaricato = scdicaricato;
		this.scdinote = scdinote;
	}

	@Id
	@Column(name = "SCDIid", unique = true, nullable = false)
	public int getScdiid() {
		return this.scdiid;
	}

	public void setScdiid(int scdiid) {
		this.scdiid = scdiid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SCDIfornitore")
	public Sicammaziende getSicammaziende() {
		return this.sicammaziende;
	}

	public void setSicammaziende(Sicammaziende sicammaziende) {
		this.sicammaziende = sicammaziende;
	}

	@Column(name = "SCDInsnumero")
	public Integer getScdinsnumero() {
		return this.scdinsnumero;
	}

	public void setScdinsnumero(Integer scdinsnumero) {
		this.scdinsnumero = scdinsnumero;
	}

	@Column(name = "SCDIdata", length = 45)
	public String getScdidata() {
		return this.scdidata;
	}

	public void setScdidata(String scdidata) {
		this.scdidata = scdidata;
	}

	@Column(name = "SCDInumero", length = 45)
	public String getScdinumero() {
		return this.scdinumero;
	}

	public void setScdinumero(String scdinumero) {
		this.scdinumero = scdinumero;
	}

	@Column(name = "SCDIfattura")
	public Integer getScdifattura() {
		return this.scdifattura;
	}

	public void setScdifattura(Integer scdifattura) {
		this.scdifattura = scdifattura;
	}

	@Column(name = "SCDIcausale")
	public Byte getScdicausale() {
		return this.scdicausale;
	}

	public void setScdicausale(Byte scdicausale) {
		this.scdicausale = scdicausale;
	}

	@Column(name = "SCDIcaricato")
	public Boolean getScdicaricato() {
		return this.scdicaricato;
	}

	public void setScdicaricato(Boolean scdicaricato) {
		this.scdicaricato = scdicaricato;
	}

	@Column(name = "SCDInote", length = 300)
	public String getScdinote() {
		return this.scdinote;
	}

	public void setScdinote(String scdinote) {
		this.scdinote = scdinote;
	}

}
