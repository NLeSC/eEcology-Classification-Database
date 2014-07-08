package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_access_device database table.
 * 
 */
@Embeddable
public class AccessDevicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String username;

	@Column(name="device_info_serial")
	private Integer deviceInfoSerial;

    public AccessDevicePK() {
    }
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getDeviceInfoSerial() {
		return this.deviceInfoSerial;
	}
	public void setDeviceInfoSerial(Integer deviceInfoSerial) {
		this.deviceInfoSerial = deviceInfoSerial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccessDevicePK)) {
			return false;
		}
		AccessDevicePK castOther = (AccessDevicePK)other;
		return 
			this.username.equals(castOther.username)
			&& this.deviceInfoSerial.equals(castOther.deviceInfoSerial);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.username.hashCode();
		hash = hash * prime + this.deviceInfoSerial.hashCode();
		
		return hash;
    }
}