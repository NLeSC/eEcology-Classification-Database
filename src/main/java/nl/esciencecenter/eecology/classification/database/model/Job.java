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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the job database table.
 * 
 */
@Entity
@Table(schema = "classification")
public class Job implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "JOB_JOBID_GENERATOR", sequenceName = "CLASSIFICATION.JOB_JOB_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JOB_JOBID_GENERATOR")
    @Column(name = "job_id")
    private Integer jobId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    //bi-directional many-to-one association to Classification
    @OneToMany(mappedBy = "job")
    private Set<Classification> classifications;

    //bi-directional many-to-one association to Classifier
    @ManyToOne
    @JoinColumn(name = "classifier_id")
    private Classifier classifier;

    //bi-directional many-to-one association to Job
    @ManyToOne
    @JoinColumn(name = "parent_job_id")
    private Job parent;

    //bi-directional many-to-one association to Job
    @OneToMany(mappedBy = "parent")
    private Set<Job> children;

    //bi-directional many-to-one association to JobSelection
    @OneToMany(mappedBy = "job")
    private Set<JobSelection> jobSelections;

    public Job() {
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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

    public Set<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(Set<Classification> classifications) {
        this.classifications = classifications;
    }

    public Classifier getClassifier() {
        return classifier;
    }

    public void setClassifier(Classifier classifier) {
        this.classifier = classifier;
    }

    public Job getParent() {
        return parent;
    }

    public void setParent(Job job) {
        parent = job;
    }

    public Set<Job> getChildren() {
        return children;
    }

    public void setChildren(Set<Job> jobs) {
        children = jobs;
    }

    public Set<JobSelection> getJobSelections() {
        return jobSelections;
    }

    public void setJobSelections(Set<JobSelection> jobSelections) {
        this.jobSelections = jobSelections;
    }

}