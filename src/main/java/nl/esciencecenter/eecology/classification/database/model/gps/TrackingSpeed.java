package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.postgis.PGgeometry;

/**
 * The persistent class for the uva_tracking_speed database table.
 * 
 */
@Entity
@Table(name = "uva_tracking_speed")
public class TrackingSpeed implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private TrackingSpeedPK id;

    private double altitude;

    private BigDecimal direction;

    @Column(name = "gps_fixtime")
    private double gpsFixtime;

    @Column(name = "h_accuracy")
    private double hAccuracy;

    private double latitude;

    private PGgeometry location;

    private double longitude;

    private double positiondop;

    private double pressure;

    @Column(name = "satellites_used")
    private Integer satellitesUsed;

    private double speed;

    @Column(name = "speed_accuracy")
    private double speedAccuracy;

    private double speed3d;

    private double temperature;

    private Integer userflag;

    @Column(name = "v_accuracy")
    private double vAccuracy;

    private double vdown;

    private double veast;

    private double vnorth;

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

    public TrackingSpeed() {
    }

    public TrackingSpeedPK getId() {
        return id;
    }

    public void setId(TrackingSpeedPK id) {
        this.id = id;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
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

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public Integer getSatellitesUsed() {
        return satellitesUsed;
    }

    public void setSatellitesUsed(Integer satellitesUsed) {
        this.satellitesUsed = satellitesUsed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeedAccuracy() {
        return speedAccuracy;
    }

    public void setSpeedAccuracy(double speedAccuracy) {
        this.speedAccuracy = speedAccuracy;
    }

    public double getSpeed3d() {
        return speed3d;
    }

    public void setSpeed3d(double speed3d) {
        this.speed3d = speed3d;
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

    public double getVdown() {
        return vdown;
    }

    public void setVdown(double vdown) {
        this.vdown = vdown;
    }

    public double getVeast() {
        return veast;
    }

    public void setVeast(double veast) {
        this.veast = veast;
    }

    public double getVnorth() {
        return vnorth;
    }

    public void setVnorth(double vnorth) {
        this.vnorth = vnorth;
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