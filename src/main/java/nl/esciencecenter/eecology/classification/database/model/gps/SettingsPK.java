package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_settings101 database table.
 * 
 */
@Embeddable
public class SettingsPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="device_info_serial")
	private Integer deviceInfoSerial;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="date_time")
	private java.util.Date dateTime;

    public SettingsPK() {
    }
	public Integer getDeviceInfoSerial() {
		return this.deviceInfoSerial;
	}
	public void setDeviceInfoSerial(Integer deviceInfoSerial) {
		this.deviceInfoSerial = deviceInfoSerial;
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
		if (!(other instanceof SettingsPK)) {
			return false;
		}
		SettingsPK castOther = (SettingsPK)other;
		return 
			this.deviceInfoSerial.equals(castOther.deviceInfoSerial)
			&& this.dateTime.equals(castOther.dateTime);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deviceInfoSerial.hashCode();
		hash = hash * prime + this.dateTime.hashCode();
		
		return hash;
    }
}