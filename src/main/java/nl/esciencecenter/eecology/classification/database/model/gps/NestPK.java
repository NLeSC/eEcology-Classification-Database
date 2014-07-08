package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_nest database table.
 * 
 */
@Embeddable
public class NestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ring_number")
	private String ringNumber;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="date_time")
	private java.util.Date dateTime;

    public NestPK() {
    }
	public String getRingNumber() {
		return this.ringNumber;
	}
	public void setRingNumber(String ringNumber) {
		this.ringNumber = ringNumber;
	}
	public java.util.Date getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(java.util.Date dateTime) {
		this.dateTime = dateTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NestPK)) {
			return false;
		}
		NestPK castOther = (NestPK)other;
		return 
			this.ringNumber.equals(castOther.ringNumber)
			&& this.dateTime.equals(castOther.dateTime);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ringNumber.hashCode();
		hash = hash * prime + this.dateTime.hashCode();
		
		return hash;
    }
}