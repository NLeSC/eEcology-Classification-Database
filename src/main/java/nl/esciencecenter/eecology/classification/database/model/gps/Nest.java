package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_nest database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_nest")
public class Nest implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private NestPK id;

    private double latitude;

    private double longitude;

    @Column(name = "nest_id")
    private String nestId;

    private String remarks;

    public Nest() {
    }

    public NestPK getId() {
        return id;
    }

    public void setId(NestPK id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getNestId() {
        return nestId;
    }

    public void setNestId(String nestId) {
        this.nestId = nestId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}