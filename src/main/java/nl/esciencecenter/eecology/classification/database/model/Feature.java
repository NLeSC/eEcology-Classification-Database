package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the feature database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Feature implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "FEATURE_FEATUREID_GENERATOR", sequenceName = "CLASSIFICATION.FEATURE_FEATURE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FEATURE_FEATUREID_GENERATOR")
    @Column(name = "feature_id")
    private Integer featureId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    private String expression;

    private String name;

    private String source;

    private Integer version;

    //bi-directional many-to-many association to Classifier
    @ManyToMany
    @JoinTable(name = "feature_classifier", joinColumns = { @JoinColumn(name = "feature_id") }, inverseJoinColumns = { @JoinColumn(name = "classifier_id") })
    private Set<Classifier> classifiers;

    //bi-directional many-to-one association to FeatureValue
    @OneToMany(mappedBy = "feature")
    private Set<FeatureValue> featureValues;

    public Feature() {
    }

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
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

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Set<Classifier> getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(Set<Classifier> classifiers) {
        this.classifiers = classifiers;
    }

    public Set<FeatureValue> getFeatureValues() {
        return featureValues;
    }

    public void setFeatureValues(Set<FeatureValue> featureValues) {
        this.featureValues = featureValues;
    }

}