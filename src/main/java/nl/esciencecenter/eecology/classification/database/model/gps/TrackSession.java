package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the uva_track_session database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_track_session")
public class TrackSession implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private TrackSessionPK id;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "project_leader")
    private String projectLeader;

    private String remarks;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "start_latitude")
    private double startLatitude;

    @Column(name = "start_longitude")
    private double startLongitude;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice1;

    //bi-directional many-to-one association to Individual
    @ManyToOne
    @JoinColumn(name = "ring_number", updatable = false, insertable = false)
    private Individual uvaIndividual1;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice2;

    //bi-directional many-to-one association to Individual
    @ManyToOne
    @JoinColumn(name = "ring_number", updatable = false, insertable = false)
    private Individual uvaIndividual2;

    public TrackSession() {
    }

    public TrackSessionPK getId() {
        return id;
    }

    public void setId(TrackSessionPK id) {
        this.id = id;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Device getUvaDevice1() {
        return uvaDevice1;
    }

    public void setUvaDevice1(Device uvaDevice1) {
        this.uvaDevice1 = uvaDevice1;
    }

    public Individual getUvaIndividual1() {
        return uvaIndividual1;
    }

    public void setUvaIndividual1(Individual uvaIndividual1) {
        this.uvaIndividual1 = uvaIndividual1;
    }

    public Device getUvaDevice2() {
        return uvaDevice2;
    }

    public void setUvaDevice2(Device uvaDevice2) {
        this.uvaDevice2 = uvaDevice2;
    }

    public Individual getUvaIndividual2() {
        return uvaIndividual2;
    }

    public void setUvaIndividual2(Individual uvaIndividual2) {
        this.uvaIndividual2 = uvaIndividual2;
    }

}