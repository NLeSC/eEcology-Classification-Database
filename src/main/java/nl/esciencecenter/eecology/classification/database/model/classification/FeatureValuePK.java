package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the feature_value database table.
 * 
 */
@Embeddable
public class FeatureValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="feature_id")
	private Integer featureId;

	@Column(name="segment_id")
	private Integer segmentId;

    public FeatureValuePK() {
    }
	public Integer getFeatureId() {
		return this.featureId;
	}
	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
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
		if (!(other instanceof FeatureValuePK)) {
			return false;
		}
		FeatureValuePK castOther = (FeatureValuePK)other;
		return 
			this.featureId.equals(castOther.featureId)
			&& this.segmentId.equals(castOther.segmentId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.featureId.hashCode();
		hash = hash * prime + this.segmentId.hashCode();
		
		return hash;
    }
}