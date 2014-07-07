package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the label database table.
 * 
 */
@Embeddable
public class LabelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="label_id")
	private Integer labelId;

	@Column(name="label_schema_id")
	private Integer labelSchemaId;

    public LabelPK() {
    }
	public Integer getLabelId() {
		return this.labelId;
	}
	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}
	public Integer getLabelSchemaId() {
		return this.labelSchemaId;
	}
	public void setLabelSchemaId(Integer labelSchemaId) {
		this.labelSchemaId = labelSchemaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LabelPK)) {
			return false;
		}
		LabelPK castOther = (LabelPK)other;
		return 
			this.labelId.equals(castOther.labelId)
			&& this.labelSchemaId.equals(castOther.labelSchemaId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.labelId.hashCode();
		hash = hash * prime + this.labelSchemaId.hashCode();
		
		return hash;
    }
}