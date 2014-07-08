package nl.esciencecenter.eecology.classification.database.model.gps;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the uva_energy101 database table.
 * 
 */
@Entity
@Table(schema = "gps", name = "uva_energy101")
public class Energy implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EnergyPK id;

    private Integer c;

    private Integer devicemode;

    private Integer g;

    private Integer m;

    private Integer pressure;

    private Integer ssw;

    private double temperature;

    private Integer timesynced;

    private double vbat;

    private double vchr;

    private double vdrf;

    private double vsll;

    private double vsoo;

    public Energy() {
    }

    public EnergyPK getId() {
        return id;
    }

    public void setId(EnergyPK id) {
        this.id = id;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getDevicemode() {
        return devicemode;
    }

    public void setDevicemode(Integer devicemode) {
        this.devicemode = devicemode;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getSsw() {
        return ssw;
    }

    public void setSsw(Integer ssw) {
        this.ssw = ssw;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Integer getTimesynced() {
        return timesynced;
    }

    public void setTimesynced(Integer timesynced) {
        this.timesynced = timesynced;
    }

    public double getVbat() {
        return vbat;
    }

    public void setVbat(double vbat) {
        this.vbat = vbat;
    }

    public double getVchr() {
        return vchr;
    }

    public void setVchr(double vchr) {
        this.vchr = vchr;
    }

    public double getVdrf() {
        return vdrf;
    }

    public void setVdrf(double vdrf) {
        this.vdrf = vdrf;
    }

    public double getVsll() {
        return vsll;
    }

    public void setVsll(double vsll) {
        this.vsll = vsll;
    }

    public double getVsoo() {
        return vsoo;
    }

    public void setVsoo(double vsoo) {
        this.vsoo = vsoo;
    }

}