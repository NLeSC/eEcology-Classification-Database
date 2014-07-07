package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the uva_individual database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_individual")
public class Individual implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ring_number")
    private String ringNumber;

    @Column(name = "color_ring")
    private String colorRing;

    private double mass;

    private String remarks;

    private String sex;

    private String species;

    //bi-directional many-to-one association to TrackSession
    @OneToMany(mappedBy = "uvaIndividual1")
    private Set<TrackSession> uvaTrackSessions1;

    //bi-directional many-to-one association to TrackSession
    @OneToMany(mappedBy = "uvaIndividual2")
    private Set<TrackSession> uvaTrackSessions2;

    public Individual() {
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }

    public String getColorRing() {
        return colorRing;
    }

    public void setColorRing(String colorRing) {
        this.colorRing = colorRing;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Set<TrackSession> getUvaTrackSessions1() {
        return uvaTrackSessions1;
    }

    public void setUvaTrackSessions1(Set<TrackSession> uvaTrackSessions1) {
        this.uvaTrackSessions1 = uvaTrackSessions1;
    }

    public Set<TrackSession> getUvaTrackSessions2() {
        return uvaTrackSessions2;
    }

    public void setUvaTrackSessions2(Set<TrackSession> uvaTrackSessions2) {
        this.uvaTrackSessions2 = uvaTrackSessions2;
    }

}