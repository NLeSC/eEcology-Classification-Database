package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_access_individual database table.
 * 
 */
@Embeddable
public class AccessIndividualPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String username;

	@Column(name="ring_number")
	private String ringNumber;

    public AccessIndividualPK() {
    }
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRingNumber() {
		return this.ringNumber;
	}
	public void setRingNumber(String ringNumber) {
		this.ringNumber = ringNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccessIndividualPK)) {
			return false;
		}
		AccessIndividualPK castOther = (AccessIndividualPK)other;
		return 
			this.username.equals(castOther.username)
			&& this.ringNumber.equals(castOther.ringNumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.username.hashCode();
		hash = hash * prime + this.ringNumber.hashCode();
		
		return hash;
    }
}