package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the label database table.
 * 
 */
@Embeddable
public class LabelPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "label_id")
    private Integer labelId;

    @Column(name = "label_schema_id")
    private Integer labelSchemaId;

    public LabelPK() {
    }

    public LabelPK(int labelId) {
        this.labelId = labelId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getLabelSchemaId() {
        return labelSchemaId;
    }

    public void setLabelSchemaId(Integer labelSchemaId) {
        this.labelSchemaId = labelSchemaId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelPK)) {
            return false;
        }
        LabelPK castOther = (LabelPK) other;
        return labelId.equals(castOther.labelId) && labelSchemaId.equals(castOther.labelSchemaId);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + labelId.hashCode();
        hash = hash * prime + labelSchemaId.hashCode();

        return hash;
    }
}