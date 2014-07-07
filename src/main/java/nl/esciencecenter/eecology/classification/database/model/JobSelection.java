package nl.esciencecenter.eecology.classification.database.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the job_selection database table.
 * 
 */
@Entity
@Table(schema = "classification", name = "job_selection")
public class JobSelection implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private JobSelectionPK id;

    //bi-directional many-to-one association to Job
    @ManyToOne
    @JoinColumn(name = "job_id", insertable = false, updatable = false)
    private Job job;

    public JobSelection() {
    }

    public JobSelectionPK getId() {
        return id;
    }

    public void setId(JobSelectionPK id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}