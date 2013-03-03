package sicimi.api.persistence.hibernate;

// Generated Feb 28, 2013 2:34:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sicammcommesse generated by hbm2java
 */
@Entity
@Table(name = "SICAMMCommesse", catalog = "Sicimi01")
public class Sicammcommesse implements java.io.Serializable {

	private Integer sacid;
	private Sicammaziende sicammaziende;
	private Sicammtipo sicammtipo;
	private String saccommessa;
	private Date sacdata;
	private String sacdescrizione;
	private Date sacdataconsegna;
	private Float sacimporto;
	private String sacriferimenti;
	private Boolean sacevasa;
	private Boolean sacspostata;
	private Byte sacprodotto;
	private Integer sacdestinazione;
	private String sacnote;

	public Sicammcommesse() {
	}

	public Sicammcommesse(Sicammaziende sicammaziende, Sicammtipo sicammtipo,
			String saccommessa, Date sacdata, String sacdescrizione,
			Date sacdataconsegna, Float sacimporto, String sacriferimenti,
			Boolean sacevasa, Boolean sacspostata, Byte sacprodotto,
			Integer sacdestinazione, String sacnote) {
		this.sicammaziende = sicammaziende;
		this.sicammtipo = sicammtipo;
		this.saccommessa = saccommessa;
		this.sacdata = sacdata;
		this.sacdescrizione = sacdescrizione;
		this.sacdataconsegna = sacdataconsegna;
		this.sacimporto = sacimporto;
		this.sacriferimenti = sacriferimenti;
		this.sacevasa = sacevasa;
		this.sacspostata = sacspostata;
		this.sacprodotto = sacprodotto;
		this.sacdestinazione = sacdestinazione;
		this.sacnote = sacnote;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SACid", unique = true, nullable = false)
	public Integer getSacid() {
		return this.sacid;
	}

	public void setSacid(Integer sacid) {
		this.sacid = sacid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SACcliente")
	public Sicammaziende getSicammaziende() {
		return this.sicammaziende;
	}

	public void setSicammaziende(Sicammaziende sicammaziende) {
		this.sicammaziende = sicammaziende;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SACtipo")
	public Sicammtipo getSicammtipo() {
		return this.sicammtipo;
	}

	public void setSicammtipo(Sicammtipo sicammtipo) {
		this.sicammtipo = sicammtipo;
	}

	@Column(name = "SACcommessa", length = 7)
	public String getSaccommessa() {
		return this.saccommessa;
	}

	public void setSaccommessa(String saccommessa) {
		this.saccommessa = saccommessa;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SACdata", length = 10)
	public Date getSacdata() {
		return this.sacdata;
	}

	public void setSacdata(Date sacdata) {
		this.sacdata = sacdata;
	}

	@Column(name = "SACdescrizione", length = 16777215)
	public String getSacdescrizione() {
		return this.sacdescrizione;
	}

	public void setSacdescrizione(String sacdescrizione) {
		this.sacdescrizione = sacdescrizione;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SACdataconsegna", length = 10)
	public Date getSacdataconsegna() {
		return this.sacdataconsegna;
	}

	public void setSacdataconsegna(Date sacdataconsegna) {
		this.sacdataconsegna = sacdataconsegna;
	}

	@Column(name = "SACimporto", precision = 12, scale = 0)
	public Float getSacimporto() {
		return this.sacimporto;
	}

	public void setSacimporto(Float sacimporto) {
		this.sacimporto = sacimporto;
	}

	@Column(name = "SACriferimenti", length = 65535)
	public String getSacriferimenti() {
		return this.sacriferimenti;
	}

	public void setSacriferimenti(String sacriferimenti) {
		this.sacriferimenti = sacriferimenti;
	}

	@Column(name = "SACevasa")
	public Boolean getSacevasa() {
		return this.sacevasa;
	}

	public void setSacevasa(Boolean sacevasa) {
		this.sacevasa = sacevasa;
	}

	@Column(name = "SACspostata")
	public Boolean getSacspostata() {
		return this.sacspostata;
	}

	public void setSacspostata(Boolean sacspostata) {
		this.sacspostata = sacspostata;
	}

	@Column(name = "SACprodotto")
	public Byte getSacprodotto() {
		return this.sacprodotto;
	}

	public void setSacprodotto(Byte sacprodotto) {
		this.sacprodotto = sacprodotto;
	}

	@Column(name = "SACdestinazione")
	public Integer getSacdestinazione() {
		return this.sacdestinazione;
	}

	public void setSacdestinazione(Integer sacdestinazione) {
		this.sacdestinazione = sacdestinazione;
	}

	@Column(name = "SACnote", length = 300)
	public String getSacnote() {
		return this.sacnote;
	}

	public void setSacnote(String sacnote) {
		this.sacnote = sacnote;
	}

}
