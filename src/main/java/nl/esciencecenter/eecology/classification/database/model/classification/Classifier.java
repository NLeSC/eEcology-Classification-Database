package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the classifier database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Classifier implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "CLASSIFIER_CLASSIFIERID_GENERATOR", sequenceName = "CLASSIFIER_CLASSIFIER_ID_SEQ", allocationSize = 1, schema = "CLASSIFICATION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLASSIFIER_CLASSIFIERID_GENERATOR")
    @Column(name = "classifier_id")
    private Integer classifierId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    private String description;

    private String name;

    @Column(name = "weka_object")
    private byte[] wekaObject;

    //bi-directional many-to-one association to Classifier
    @ManyToOne
    @JoinColumn(name = "parent_classifier_id")
    private Classifier parent;

    //bi-directional many-to-one association to Classifier
    @OneToMany(mappedBy = "parent")
    private Set<Classifier> children;

    //bi-directional many-to-one association to ClassifierType
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "class_type_id")
    private ClassifierType classifierType;

    //bi-directional many-to-one association to Collection
    @ManyToOne
    @JoinColumn(name = "training_set_id")
    private Collection collection;

    //bi-directional many-to-one association to LabelSchema
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "label_schema_id")
    private LabelSchema labelSchema;

    //bi-directional many-to-one association to Segmentator
    @ManyToOne
    @JoinColumn(name = "segmentator_id")
    private Segmentator segmentator;

    //bi-directional many-to-many association to Feature
    @ManyToMany(mappedBy = "classifiers", cascade = CascadeType.PERSIST)
    private Set<Feature> features;

    //bi-directional many-to-one association to Job
    @OneToMany(mappedBy = "classifier")
    private Set<Job> jobs;

    public Classifier() {
    }

    public Integer getClassifierId() {
        return classifierId;
    }

    public void setClassifierId(Integer classifierId) {
        this.classifierId = classifierId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getWekaObject() {
        return wekaObject;
    }

    public void setWekaObject(byte[] wekaObject) {
        this.wekaObject = wekaObject;
    }

    public Classifier getParent() {
        return parent;
    }

    public void setParent(Classifier classifier) {
        parent = classifier;
    }

    public Set<Classifier> getChildren() {
        return children;
    }

    public void setChildren(Set<Classifier> classifiers) {
        children = classifiers;
    }

    public ClassifierType getClassifierType() {
        return classifierType;
    }

    public void setClassifierType(ClassifierType classifierType) {
        this.classifierType = classifierType;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public LabelSchema getLabelSchema() {
        return labelSchema;
    }

    public void setLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
    }

    public Segmentator getSegmentator() {
        return segmentator;
    }

    public void setSegmentator(Segmentator segmentator) {
        this.segmentator = segmentator;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }

}