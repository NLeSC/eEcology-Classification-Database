package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the label_remap database table.
 * 
 */
@Entity
@Table(schema = "classification", name = "label_remap")
public class LabelRemap implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private LabelRemapPK id;

    //bi-directional many-to-one association to Label
    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "source_label_id", referencedColumnName = "label_id"),
            @JoinColumn(name = "source_label_schema_id", referencedColumnName = "label_schema_id") })
    private Label source;

    //bi-directional one-to-one association to Label
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "target_label_id", referencedColumnName = "label_id", insertable = false, updatable = false),
            @JoinColumn(name = "target_label_schema_id", referencedColumnName = "label_schema_id", insertable = false, updatable = false) })
    private Label target;

    public LabelRemap() {
    }

    public LabelRemapPK getId() {
        return id;
    }

    public void setId(LabelRemapPK id) {
        this.id = id;
    }

    public Label getSource() {
        return source;
    }

    public void setSource(Label label1) {
        source = label1;
    }

    public Label getTarget() {
        return target;
    }

    public void setTarget(Label label2) {
        target = label2;
    }

}