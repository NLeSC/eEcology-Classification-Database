package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * The persistent class for the classification database table.
 * 
 */
@Entity
public class Classification implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ClassificationPK id;

    //bi-directional many-to-one association to Job
    @ManyToOne
    @JoinColumn(name = "job_id", insertable = false, updatable = false)
    private Job job;

    //bi-directional many-to-one association to Label
    @ManyToOne
    @JoinColumns({ @JoinColumn(name = "label_id", referencedColumnName = "label_id"),
            @JoinColumn(name = "label_schema_id", referencedColumnName = "label_schema_id") })
    private Label label;

    //bi-directional many-to-one association to Segment
    @ManyToOne
    @JoinColumn(name = "segment_id", insertable = false, updatable = false)
    private Segment segment;

    //bi-directional many-to-many association to Collection
    @ManyToMany
    @JoinTable(name = "classification_collection", joinColumns = { @JoinColumn(name = "job_id", referencedColumnName = "job_id"),
            @JoinColumn(name = "segment_id", referencedColumnName = "segment_id") }, inverseJoinColumns = { @JoinColumn(name = "collection_id") })
    private Set<Collection> collections;

    public Classification() {
    }

    public ClassificationPK getId() {
        return id;
    }

    public void setId(ClassificationPK id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public Set<Collection> getCollections() {
        return collections;
    }

    public void setCollections(Set<Collection> collections) {
        this.collections = collections;
    }

}