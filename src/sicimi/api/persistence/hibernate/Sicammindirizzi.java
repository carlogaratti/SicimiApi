package sicimi.api.persistence.hibernate;

// Generated Mar 4, 2013 4:32:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sicammindirizzi generated by hbm2java
 */
@Entity
@Table(name = "SICAMMIndirizzi", catalog = "Sicimi01")
public class Sicammindirizzi implements java.io.Serializable {

	private int saiid;
	private Sicammaziende sicammaziende;
	private String saiindirizzo;
	private String saicitta;
	private String saiprovincia;
	private String saicap;
	private String saistato;
	private String sainote;
	private Boolean saisubcliente;
	private Boolean saisedelegale;
	private Set<Sicammaziende> sicammaziendes = new HashSet<Sicammaziende>(0);
	private Set<Sicammcommesse> sicammcommesses = new HashSet<Sicammcommesse>(0);

	public Sicammindirizzi() {
	}

	public Sicammindirizzi(int saiid) {
		this.saiid = saiid;
	}

	public Sicammindirizzi(int saiid, Sicammaziende sicammaziende,
			String saiindirizzo, String saicitta, String saiprovincia,
			String saicap, String saistato, String sainote,
			Boolean saisubcliente, Boolean saisedelegale,
			Set<Sicammaziende> sicammaziendes,
			Set<Sicammcommesse> sicammcommesses) {
		this.saiid = saiid;
		this.sicammaziende = sicammaziende;
		this.saiindirizzo = saiindirizzo;
		this.saicitta = saicitta;
		this.saiprovincia = saiprovincia;
		this.saicap = saicap;
		this.saistato = saistato;
		this.sainote = sainote;
		this.saisubcliente = saisubcliente;
		this.saisedelegale = saisedelegale;
		this.sicammaziendes = sicammaziendes;
		this.sicammcommesses = sicammcommesses;
	}

	@Id
	@Column(name = "SAIid", unique = true, nullable = false)
	public int getSaiid() {
		return this.saiid;
	}

	public void setSaiid(int saiid) {
		this.saiid = saiid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SAIidazienda")
	public Sicammaziende getSicammaziende() {
		return this.sicammaziende;
	}

	public void setSicammaziende(Sicammaziende sicammaziende) {
		this.sicammaziende = sicammaziende;
	}

	@Column(name = "SAIindirizzo", length = 200)
	public String getSaiindirizzo() {
		return this.saiindirizzo;
	}

	public void setSaiindirizzo(String saiindirizzo) {
		this.saiindirizzo = saiindirizzo;
	}

	@Column(name = "SAIcitta", length = 60)
	public String getSaicitta() {
		return this.saicitta;
	}

	public void setSaicitta(String saicitta) {
		this.saicitta = saicitta;
	}

	@Column(name = "SAIprovincia", length = 60)
	public String getSaiprovincia() {
		return this.saiprovincia;
	}

	public void setSaiprovincia(String saiprovincia) {
		this.saiprovincia = saiprovincia;
	}

	@Column(name = "SAIcap", length = 20)
	public String getSaicap() {
		return this.saicap;
	}

	public void setSaicap(String saicap) {
		this.saicap = saicap;
	}

	@Column(name = "SAIstato", length = 30)
	public String getSaistato() {
		return this.saistato;
	}

	public void setSaistato(String saistato) {
		this.saistato = saistato;
	}

	@Column(name = "SAInote", length = 300)
	public String getSainote() {
		return this.sainote;
	}

	public void setSainote(String sainote) {
		this.sainote = sainote;
	}

	@Column(name = "SAIsubcliente")
	public Boolean getSaisubcliente() {
		return this.saisubcliente;
	}

	public void setSaisubcliente(Boolean saisubcliente) {
		this.saisubcliente = saisubcliente;
	}

	@Column(name = "SAIsedelegale")
	public Boolean getSaisedelegale() {
		return this.saisedelegale;
	}

	public void setSaisedelegale(Boolean saisedelegale) {
		this.saisedelegale = saisedelegale;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sicammindirizzi")
	public Set<Sicammaziende> getSicammaziendes() {
		return this.sicammaziendes;
	}

	public void setSicammaziendes(Set<Sicammaziende> sicammaziendes) {
		this.sicammaziendes = sicammaziendes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sicammindirizzi")
	public Set<Sicammcommesse> getSicammcommesses() {
		return this.sicammcommesses;
	}

	public void setSicammcommesses(Set<Sicammcommesse> sicammcommesses) {
		this.sicammcommesses = sicammcommesses;
	}

}