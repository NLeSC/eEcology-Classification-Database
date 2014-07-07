package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
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
 * The persistent class for the segmentator database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Segmentator implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "SEGMENTATOR_SEGMENTATORID_GENERATOR", sequenceName = "CLASSIFICATION.SEGMENTATOR_SEGMENTATOR_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEGMENTATOR_SEGMENTATORID_GENERATOR")
    @Column(name = "segmentator_id")
    private Integer segmentatorId;

    private String configuration;

    private String name;

    //bi-directional many-to-one association to Classifier
    @OneToMany(mappedBy = "segmentator")
    private Set<Classifier> classifiers;

    public Segmentator() {
    }

    public Integer getSegmentatorId() {
        return segmentatorId;
    }

    public void setSegmentatorId(Integer segmentatorId) {
        this.segmentatorId = segmentatorId;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
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

}