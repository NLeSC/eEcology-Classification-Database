package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the label_schema database table.
 * 
 */
@Entity
@Table(schema = "classification", name = "label_schema")
public class LabelSchema implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "LABEL_SCHEMA_LABELSCHEMAID_GENERATOR", sequenceName = "CLASSIFICATION.LABEL_SCHEMA_LABEL_SCHEMA_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LABEL_SCHEMA_LABELSCHEMAID_GENERATOR")
    @Column(name = "label_schema_id")
    private Integer labelSchemaId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    private String name;

    //bi-directional many-to-one association to Classifier
    @OneToMany(mappedBy = "labelSchema")
    private Set<Classifier> classifiers;

    //bi-directional many-to-one association to Label
    @OneToMany(mappedBy = "labelSchema")
    private Set<Label> labels;

    public LabelSchema() {
    }

    public Integer getLabelSchemaId() {
        return labelSchemaId;
    }

    public void setLabelSchemaId(Integer labelSchemaId) {
        this.labelSchemaId = labelSchemaId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Classifier> getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(Set<Classifier> classifiers) {
        this.classifiers = classifiers;
    }

    public Set<Label> getLabels() {
        return labels;
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }

}