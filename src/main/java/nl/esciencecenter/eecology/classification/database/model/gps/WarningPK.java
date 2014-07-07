package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uva_warning102 database table.
 * 
 */
@Embeddable
public class WarningPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="device_info_serial")
	private Integer deviceInfoSerial;

	private String filename;

	private Integer linenumber;

    public WarningPK() {
    }
	public Integer getDeviceInfoSerial() {
		return this.deviceInfoSerial;
	}
	public void setDeviceInfoSerial(Integer deviceInfoSerial) {
		this.deviceInfoSerial = deviceInfoSerial;
	}
	public String getFilename() {
		return this.filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Integer getLinenumber() {
		return this.linenumber;
	}
	public void setLinenumber(Integer linenumber) {
		this.linenumber = linenumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WarningPK)) {
			return false;
		}
		WarningPK castOther = (WarningPK)other;
		return 
			this.deviceInfoSerial.equals(castOther.deviceInfoSerial)
			&& this.filename.equals(castOther.filename)
			&& this.linenumber.equals(castOther.linenumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deviceInfoSerial.hashCode();
		hash = hash * prime + this.filename.hashCode();
		hash = hash * prime + this.linenumber.hashCode();
		
		return hash;
    }
}