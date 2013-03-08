package sicimi.api.persistence.hibernate;

// Generated Mar 8, 2013 9:27:38 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SiccomfattureClientiExtendedId generated by hbm2java
 */
@Embeddable
public class SiccomfattureClientiExtendedId implements java.io.Serializable {

	private int scfceidfattura;
	private int scfceidcommessa;

	public SiccomfattureClientiExtendedId() {
	}

	public SiccomfattureClientiExtendedId(int scfceidfattura,
			int scfceidcommessa) {
		this.scfceidfattura = scfceidfattura;
		this.scfceidcommessa = scfceidcommessa;
	}

	@Column(name = "SCFCEidfattura", nullable = false)
	public int getScfceidfattura() {
		return this.scfceidfattura;
	}

	public void setScfceidfattura(int scfceidfattura) {
		this.scfceidfattura = scfceidfattura;
	}

	@Column(name = "SCFCEidcommessa", nullable = false)
	public int getScfceidcommessa() {
		return this.scfceidcommessa;
	}

	public void setScfceidcommessa(int scfceidcommessa) {
		this.scfceidcommessa = scfceidcommessa;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SiccomfattureClientiExtendedId))
			return false;
		SiccomfattureClientiExtendedId castOther = (SiccomfattureClientiExtendedId) other;

		return (this.getScfceidfattura() == castOther.getScfceidfattura())
				&& (this.getScfceidcommessa() == castOther.getScfceidcommessa());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getScfceidfattura();
		result = 37 * result + this.getScfceidcommessa();
		return result;
	}

}
