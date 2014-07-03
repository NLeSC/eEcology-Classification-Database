package nl.esciencecenter.eecology.classification.database.model;

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
 * The persistent class for the collection_group database table.
 * 
 */
@Entity
@Table(name = "collection_group")
public class CollectionGroup implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "COLLECTION_GROUP_COLLECTIONGROUPID_GENERATOR", sequenceName = "CLASSIFICATION.COLLECTION_GROUP_COLLECTION_GROUP_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLLECTION_GROUP_COLLECTIONGROUPID_GENERATOR")
    @Column(name = "collection_group_id")
    private Integer collectionGroupId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    private String description;

    private String name;

    //bi-directional many-to-one association to Collection
    @OneToMany(mappedBy = "collectionGroup")
    private Set<Collection> collections;

    public CollectionGroup() {
    }

    public Integer getCollectionGroupId() {
        return collectionGroupId;
    }

    public void setCollectionGroupId(Integer collectionGroupId) {
        this.collectionGroupId = collectionGroupId;
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

    public Set<Collection> getCollections() {
        return collections;
    }

    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }

}