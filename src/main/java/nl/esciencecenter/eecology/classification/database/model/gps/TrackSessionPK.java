package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_track_session database table.
 * 
 */
@Embeddable
public class TrackSessionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="device_info_serial")
	private Integer deviceInfoSerial;

	@Column(name="ring_number")
	private String ringNumber;

    public TrackSessionPK() {
    }
	public Integer getDeviceInfoSerial() {
		return this.deviceInfoSerial;
	}
	public void setDeviceInfoSerial(Integer deviceInfoSerial) {
		this.deviceInfoSerial = deviceInfoSerial;
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
		if (!(other instanceof TrackSessionPK)) {
			return false;
		}
		TrackSessionPK castOther = (TrackSessionPK)other;
		return 
			this.deviceInfoSerial.equals(castOther.deviceInfoSerial)
			&& this.ringNumber.equals(castOther.ringNumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deviceInfoSerial.hashCode();
		hash = hash * prime + this.ringNumber.hashCode();
		
		return hash;
    }
}