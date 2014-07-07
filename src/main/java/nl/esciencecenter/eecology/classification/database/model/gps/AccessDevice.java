package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the uva_access_device database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_access_device")
public class AccessDevice implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AccessDevicePK id;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice;

    public AccessDevice() {
    }

    public AccessDevicePK getId() {
        return id;
    }

    public void setId(AccessDevicePK id) {
        this.id = id;
    }

    public Device getUvaDevice() {
        return uvaDevice;
    }

    public void setUvaDevice(Device uvaDevice) {
        this.uvaDevice = uvaDevice;
    }

}