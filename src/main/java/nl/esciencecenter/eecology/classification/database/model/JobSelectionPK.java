package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the job_selection database table.
 * 
 */
@Embeddable
public class JobSelectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="job_id")
	private Integer jobId;

	@Column(name="device_info_serial")
	private Integer deviceInfoSerial;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="start_date_time")
	private java.util.Date startDateTime;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="end_date_time")
	private java.util.Date endDateTime;

    public JobSelectionPK() {
    }
	public Integer getJobId() {
		return this.jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getDeviceInfoSerial() {
		return this.deviceInfoSerial;
	}
	public void setDeviceInfoSerial(Integer deviceInfoSerial) {
		this.deviceInfoSerial = deviceInfoSerial;
	}
	public java.util.Date getStartDateTime() {
		return this.startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public java.util.Date getEndDateTime() {
		return this.endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JobSelectionPK)) {
			return false;
		}
		JobSelectionPK castOther = (JobSelectionPK)other;
		return 
			this.jobId.equals(castOther.jobId)
			&& this.deviceInfoSerial.equals(castOther.deviceInfoSerial)
			&& this.startDateTime.equals(castOther.startDateTime)
			&& this.endDateTime.equals(castOther.endDateTime);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jobId.hashCode();
		hash = hash * prime + this.deviceInfoSerial.hashCode();
		hash = hash * prime + this.startDateTime.hashCode();
		hash = hash * prime + this.endDateTime.hashCode();
		
		return hash;
    }
}