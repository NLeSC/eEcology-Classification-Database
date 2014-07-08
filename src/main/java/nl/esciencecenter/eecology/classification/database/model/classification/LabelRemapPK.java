package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the label_remap database table.
 * 
 */
@Embeddable
public class LabelRemapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="target_label_id")
	private Integer targetLabelId;

	@Column(name="target_label_schema_id")
	private Integer targetLabelSchemaId;

    public LabelRemapPK() {
    }
	public Integer getTargetLabelId() {
		return this.targetLabelId;
	}
	public void setTargetLabelId(Integer targetLabelId) {
		this.targetLabelId = targetLabelId;
	}
	public Integer getTargetLabelSchemaId() {
		return this.targetLabelSchemaId;
	}
	public void setTargetLabelSchemaId(Integer targetLabelSchemaId) {
		this.targetLabelSchemaId = targetLabelSchemaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LabelRemapPK)) {
			return false;
		}
		LabelRemapPK castOther = (LabelRemapPK)other;
		return 
			this.targetLabelId.equals(castOther.targetLabelId)
			&& this.targetLabelSchemaId.equals(castOther.targetLabelSchemaId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.targetLabelId.hashCode();
		hash = hash * prime + this.targetLabelSchemaId.hashCode();
		
		return hash;
    }
}