package nl.esciencecenter.eecology.classification.database.model;

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
 * The persistent class for the classifier_type database table.
 * 
 */
@Entity
@Table(name = "classifier_type")
public class ClassifierType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "CLASSIFIER_TYPE_CLASSTYPEID_GENERATOR", sequenceName = "CLASSIFICATION.CLASSIFIER_TYPE_CLASS_TYPE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLASSIFIER_TYPE_CLASSTYPEID_GENERATOR")
    @Column(name = "class_type_id")
    private Integer classTypeId;

    private String name;

    //bi-directional many-to-one association to Classifier
    @OneToMany(mappedBy = "classifierType")
    private Set<Classifier> classifiers;

    public ClassifierType() {
    }

    public Integer getClassTypeId() {
        return classTypeId;
    }

    public void setClassTypeId(Integer classTypeId) {
        this.classTypeId = classTypeId;
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