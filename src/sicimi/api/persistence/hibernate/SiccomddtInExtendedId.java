package sicimi.api.persistence.hibernate;

// Generated Mar 8, 2013 11:51:09 AM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SiccomddtInExtendedId generated by hbm2java
 */
@Embeddable
public class SiccomddtInExtendedId implements java.io.Serializable {

	private int scdieddtinid;
	private int scdiecommessaid;
	private int scdieordineid;

	public SiccomddtInExtendedId() {
	}

	public SiccomddtInExtendedId(int scdieddtinid, int scdiecommessaid,
			int scdieordineid) {
		this.scdieddtinid = scdieddtinid;
		this.scdiecommessaid = scdiecommessaid;
		this.scdieordineid = scdieordineid;
	}

	@Column(name = "SCDIEddtinid", nullable = false)
	public int getScdieddtinid() {
		return this.scdieddtinid;
	}

	public void setScdieddtinid(int scdieddtinid) {
		this.scdieddtinid = scdieddtinid;
	}

	@Column(name = "SCDIEcommessaid", nullable = false)
	public int getScdiecommessaid() {
		return this.scdiecommessaid;
	}

	public void setScdiecommessaid(int scdiecommessaid) {
		this.scdiecommessaid = scdiecommessaid;
	}

	@Column(name = "SCDIEordineid", nullable = false)
	public int getScdieordineid() {
		return this.scdieordineid;
	}

	public void setScdieordineid(int scdieordineid) {
		this.scdieordineid = scdieordineid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SiccomddtInExtendedId))
			return false;
		SiccomddtInExtendedId castOther = (SiccomddtInExtendedId) other;

		return (this.getScdieddtinid() == castOther.getScdieddtinid())
				&& (this.getScdiecommessaid() == castOther.getScdiecommessaid())
				&& (this.getScdieordineid() == castOther.getScdieordineid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getScdieddtinid();
		result = 37 * result + this.getScdiecommessaid();
		result = 37 * result + this.getScdieordineid();
		return result;
	}

}