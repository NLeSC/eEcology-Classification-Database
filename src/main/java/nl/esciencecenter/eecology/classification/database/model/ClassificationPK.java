package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the classification database table.
 * 
 */
@Embeddable
public class ClassificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="job_id")
	private Integer jobId;

	@Column(name="segment_id")
	private Integer segmentId;

    public ClassificationPK() {
    }
	public Integer getJobId() {
		return this.jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getSegmentId() {
		return this.segmentId;
	}
	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClassificationPK)) {
			return false;
		}
		ClassificationPK castOther = (ClassificationPK)other;
		return 
			this.jobId.equals(castOther.jobId)
			&& this.segmentId.equals(castOther.segmentId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jobId.hashCode();
		hash = hash * prime + this.segmentId.hashCode();
		
		return hash;
    }
}