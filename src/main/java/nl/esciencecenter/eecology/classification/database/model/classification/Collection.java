package nl.esciencecenter.eecology.classification.database.model.classification;

import java.io.Serializable;
import java.util.Set;

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
 * The persistent class for the collection database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Collection implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "COLLECTION_COLLECTIONID_GENERATOR", sequenceName = "CLASSIFICATION.COLLECTION_COLLECTION_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLLECTION_COLLECTIONID_GENERATOR")
    @Column(name = "collection_id")
    private Integer collectionId;

    private String type;

    //bi-directional many-to-many association to Classification
    @ManyToMany(mappedBy = "collections")
    private Set<Classification> classifications;

    //bi-directional many-to-one association to Classifier
    @OneToMany(mappedBy = "collection")
    private Set<Classifier> classifiers;

    //bi-directional many-to-one association to CollectionGroup
    @ManyToOne
    @JoinColumn(name = "collection_group_id")
    private CollectionGroup collectionGroup;

    public Collection() {
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(Set<Classification> classifications) {
        this.classifications = classifications;
    }

    public Set<Classifier> getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(Set<Classifier> classifiers) {
        this.classifiers = classifiers;
    }

    public CollectionGroup getCollectionGroup() {
        return collectionGroup;
    }

    public void setCollectionGroup(CollectionGroup collectionGroup) {
        this.collectionGroup = collectionGroup;
    }

}