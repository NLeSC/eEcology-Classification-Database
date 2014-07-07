package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TrackingSpeedPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "device_info_serial")
    private Integer deviceInfoSerial;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time")
    private java.util.Date dateTime;

    public TrackingSpeedPK() {
    }

    public Integer getDeviceInfoSerial() {
        return deviceInfoSerial;
    }

    public void setDeviceInfoSerial(Integer deviceInfoSerial) {
        this.deviceInfoSerial = deviceInfoSerial;
    }

    public java.util.Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(java.util.Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingSpeedPK)) {
            return false;
        }
        TrackingSpeedPK castOther = (TrackingSpeedPK) other;
        return deviceInfoSerial.equals(castOther.deviceInfoSerial) && dateTime.equals(castOther.dateTime);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + deviceInfoSerial.hashCode();
        hash = hash * prime + dateTime.hashCode();

        return hash;
    }
}