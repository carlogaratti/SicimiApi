package sicimi.api.persistence.hibernate;

// Generated Mar 15, 2013 4:48:02 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private Sicammaziende sicammaziendeBySacdestinazione;
	private Sicammaziende sicammaziendeBySaccliente;
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
	private String sacnote;
	private Set<SictecnumeriFabbrica> sictecnumeriFabbricas = new HashSet<SictecnumeriFabbrica>(
			0);
	private Set<SiccomfattureFornitori> siccomfattureFornitoris = new HashSet<SiccomfattureFornitori>(
			0);
	private Set<Siccomofferte> siccomoffertes = new HashSet<Siccomofferte>(0);
	private Set<SiccomfattureClienti> siccomfattureClientis = new HashSet<SiccomfattureClienti>(
			0);

	public Sicammcommesse() {
	}

	public Sicammcommesse(Sicammaziende sicammaziendeBySacdestinazione,
			Sicammaziende sicammaziendeBySaccliente, Sicammtipo sicammtipo,
			String saccommessa, Date sacdata, String sacdescrizione,
			Date sacdataconsegna, Float sacimporto, String sacriferimenti,
			Boolean sacevasa, Boolean sacspostata, Byte sacprodotto,
			String sacnote, Set<SictecnumeriFabbrica> sictecnumeriFabbricas,
			Set<SiccomfattureFornitori> siccomfattureFornitoris,
			Set<Siccomofferte> siccomoffertes,
			Set<SiccomfattureClienti> siccomfattureClientis) {
		this.sicammaziendeBySacdestinazione = sicammaziendeBySacdestinazione;
		this.sicammaziendeBySaccliente = sicammaziendeBySaccliente;
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
		this.sacnote = sacnote;
		this.sictecnumeriFabbricas = sictecnumeriFabbricas;
		this.siccomfattureFornitoris = siccomfattureFornitoris;
		this.siccomoffertes = siccomoffertes;
		this.siccomfattureClientis = siccomfattureClientis;
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
	@JoinColumn(name = "SACdestinazione")
	public Sicammaziende getSicammaziendeBySacdestinazione() {
		return this.sicammaziendeBySacdestinazione;
	}

	public void setSicammaziendeBySacdestinazione(
			Sicammaziende sicammaziendeBySacdestinazione) {
		this.sicammaziendeBySacdestinazione = sicammaziendeBySacdestinazione;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SACcliente")
	public Sicammaziende getSicammaziendeBySaccliente() {
		return this.sicammaziendeBySaccliente;
	}

	public void setSicammaziendeBySaccliente(
			Sicammaziende sicammaziendeBySaccliente) {
		this.sicammaziendeBySaccliente = sicammaziendeBySaccliente;
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
	@Column(name = "SACdata", length = 0)
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
	@Column(name = "SACdataconsegna", length = 0)
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

	@Column(name = "SACnote", length = 300)
	public String getSacnote() {
		return this.sacnote;
	}

	public void setSacnote(String sacnote) {
		this.sacnote = sacnote;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sicammcommesse")
	public Set<SictecnumeriFabbrica> getSictecnumeriFabbricas() {
		return this.sictecnumeriFabbricas;
	}

	public void setSictecnumeriFabbricas(
			Set<SictecnumeriFabbrica> sictecnumeriFabbricas) {
		this.sictecnumeriFabbricas = sictecnumeriFabbricas;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SICCOMFattureFornitoriExtended", catalog = "Sicimi01", joinColumns = { @JoinColumn(name = "SCFFEidcommessa", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCFFEidfattura", nullable = false, updatable = false) })
	public Set<SiccomfattureFornitori> getSiccomfattureFornitoris() {
		return this.siccomfattureFornitoris;
	}

	public void setSiccomfattureFornitoris(
			Set<SiccomfattureFornitori> siccomfattureFornitoris) {
		this.siccomfattureFornitoris = siccomfattureFornitoris;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SICCOMOfferteExtended", catalog = "Sicimi01", joinColumns = { @JoinColumn(name = "SCFEidcommessa", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCFEidofferta", nullable = false, updatable = false) })
	public Set<Siccomofferte> getSiccomoffertes() {
		return this.siccomoffertes;
	}

	public void setSiccomoffertes(Set<Siccomofferte> siccomoffertes) {
		this.siccomoffertes = siccomoffertes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SICCOMFattureClientiExtended", catalog = "Sicimi01", joinColumns = { @JoinColumn(name = "SCFCEidcommessa", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCFCEidfattura", nullable = false, updatable = false) })
	public Set<SiccomfattureClienti> getSiccomfattureClientis() {
		return this.siccomfattureClientis;
	}

	public void setSiccomfattureClientis(
			Set<SiccomfattureClienti> siccomfattureClientis) {
		this.siccomfattureClientis = siccomfattureClientis;
	}

}