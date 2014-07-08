package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.postgis.PGgeometry;

/**
 * The persistent class for the uva_tracking_data101 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_tracking_data101")
public class TrackingData101 implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private TrackingData101PK id;

    private Integer altitude;

    @Column(name = "gps_fixtime")
    private double gpsFixtime;

    @Column(name = "h_accuracy")
    private double hAccuracy;

    private double latitude;

    private PGgeometry location;

    private double longitude;

    private double positiondop;

    private Integer pressure;

    @Column(name = "satellites_used")
    private Integer satellitesUsed;

    @Column(name = "speed_accuracy")
    private double speedAccuracy;

    private double temperature;

    private Integer userflag;

    @Column(name = "v_accuracy")
    private double vAccuracy;

    @Column(name = "x_speed")
    private double xSpeed;

    @Column(name = "y_speed")
    private double ySpeed;

    @Column(name = "z_speed")
    private double zSpeed;

    //bi-directional many-to-one association to Device
    @ManyToOne
    @JoinColumn(name = "device_info_serial", updatable = false, insertable = false)
    private Device uvaDevice;

    public TrackingData101() {
    }

    public TrackingData101PK getId() {
        return id;
    }

    public void setId(TrackingData101PK id) {
        this.id = id;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public double getGpsFixtime() {
        return gpsFixtime;
    }

    public void setGpsFixtime(double gpsFixtime) {
        this.gpsFixtime = gpsFixtime;
    }

    public double getHAccuracy() {
        return hAccuracy;
    }

    public void setHAccuracy(double hAccuracy) {
        this.hAccuracy = hAccuracy;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public PGgeometry getLocation() {
        return location;
    }

    public void setLocation(PGgeometry location) {
        this.location = location;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPositiondop() {
        return positiondop;
    }

    public void setPositiondop(double positiondop) {
        this.positiondop = positiondop;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getSatellitesUsed() {
        return satellitesUsed;
    }

    public void setSatellitesUsed(Integer satellitesUsed) {
        this.satellitesUsed = satellitesUsed;
    }

    public double getSpeedAccuracy() {
        return speedAccuracy;
    }

    public void setSpeedAccuracy(double speedAccuracy) {
        this.speedAccuracy = speedAccuracy;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Integer getUserflag() {
        return userflag;
    }

    public void setUserflag(Integer userflag) {
        this.userflag = userflag;
    }

    public double getVAccuracy() {
        return vAccuracy;
    }

    public void setVAccuracy(double vAccuracy) {
        this.vAccuracy = vAccuracy;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getZSpeed() {
        return zSpeed;
    }

    public void setZSpeed(double zSpeed) {
        this.zSpeed = zSpeed;
    }

    public Device getUvaDevice() {
        return uvaDevice;
    }

    public void setUvaDevice(Device uvaDevice) {
        this.uvaDevice = uvaDevice;
    }

}