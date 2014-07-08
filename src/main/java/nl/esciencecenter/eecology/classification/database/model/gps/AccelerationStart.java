package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the uva_acc_start102 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_acc_start102")
public class AccelerationStart implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AccelerationStartPK id;

    private Integer accii;

    private Integer accsn;

    private Integer f;

    @Column(name = "line_counter")
    private Integer lineCounter;

    private Integer timesynced;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice;

    public AccelerationStart() {
    }

    public AccelerationStartPK getId() {
        return id;
    }

    public void setId(AccelerationStartPK id) {
        this.id = id;
    }

    public Integer getAccii() {
        return accii;
    }

    public void setAccii(Integer accii) {
        this.accii = accii;
    }

    public Integer getAccsn() {
        return accsn;
    }

    public void setAccsn(Integer accsn) {
        this.accsn = accsn;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public Integer getLineCounter() {
        return lineCounter;
    }

    public void setLineCounter(Integer lineCounter) {
        this.lineCounter = lineCounter;
    }

    public Integer getTimesynced() {
        return timesynced;
    }

    public void setTimesynced(Integer timesynced) {
        this.timesynced = timesynced;
    }

    public Device getUvaDevice() {
        return uvaDevice;
    }

    public void setUvaDevice(Device uvaDevice) {
        this.uvaDevice = uvaDevice;
    }

}