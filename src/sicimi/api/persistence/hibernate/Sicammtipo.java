package sicimi.api.persistence.hibernate;

// Generated Mar 4, 2013 4:32:35 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sicammtipo generated by hbm2java
 */
@Entity
@Table(name = "SICAMMTipo", catalog = "Sicimi01")
public class Sicammtipo implements java.io.Serializable {

	private byte satid;
	private String sattipo;
	private String satnote;
	private Set<Sicammcommesse> sicammcommesses = new HashSet<Sicammcommesse>(0);

	public Sicammtipo() {
	}

	public Sicammtipo(byte satid) {
		this.satid = satid;
	}

	public Sicammtipo(byte satid, String sattipo, String satnote,
			Set<Sicammcommesse> sicammcommesses) {
		this.satid = satid;
		this.sattipo = sattipo;
		this.satnote = satnote;
		this.sicammcommesses = sicammcommesses;
	}

	@Id
	@Column(name = "SATid", unique = true, nullable = false)
	public byte getSatid() {
		return this.satid;
	}

	public void setSatid(byte satid) {
		this.satid = satid;
	}

	@Column(name = "SATtipo", length = 45)
	public String getSattipo() {
		return this.sattipo;
	}

	public void setSattipo(String sattipo) {
		this.sattipo = sattipo;
	}

	@Column(name = "SATnote", length = 300)
	public String getSatnote() {
		return this.satnote;
	}

	public void setSatnote(String satnote) {
		this.satnote = satnote;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sicammtipo")
	public Set<Sicammcommesse> getSicammcommesses() {
		return this.sicammcommesses;
	}

	public void setSicammcommesses(Set<Sicammcommesse> sicammcommesses) {
		this.sicammcommesses = sicammcommesses;
	}

}
