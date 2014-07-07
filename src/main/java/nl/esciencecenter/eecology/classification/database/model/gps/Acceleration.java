package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the uva_acceleration101 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_acceleration101")
public class Acceleration implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AccelerationPK id;

    @Column(name = "x_acceleration")
    private Integer xAcceleration;

    @Column(name = "y_acceleration")
    private Integer yAcceleration;

    @Column(name = "z_acceleration")
    private Integer zAcceleration;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice;

    public Acceleration() {
    }

    public AccelerationPK getId() {
        return id;
    }

    public void setId(AccelerationPK id) {
        this.id = id;
    }

    public Integer getXAcceleration() {
        return xAcceleration;
    }

    public void setXAcceleration(Integer xAcceleration) {
        this.xAcceleration = xAcceleration;
    }

    public Integer getYAcceleration() {
        return yAcceleration;
    }

    public void setYAcceleration(Integer yAcceleration) {
        this.yAcceleration = yAcceleration;
    }

    public Integer getZAcceleration() {
        return zAcceleration;
    }

    public void setZAcceleration(Integer zAcceleration) {
        this.zAcceleration = zAcceleration;
    }

    public Device getUvaDevice() {
        return uvaDevice;
    }

    public void setUvaDevice(Device uvaDevice) {
        this.uvaDevice = uvaDevice;
    }

}