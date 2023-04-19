package edu.neu.info5100.model.Objects;

import java.util.Date;

public class Car {
    private int id;
    private String enterpriseName;
    private String name;
    private Date maintenance_date;
    private java.sql.Date manufacturing_year;
    private int ServicePeriod;
    private java.sql.Date serviceStart;
    private java.sql.Date serviceEnd;
    private String license;

    public Car(int id, String enterpriseName, String name, Date maintenance_date, java.sql.Date manufacturing_year, int servicePeriod, java.sql.Date serviceStart, java.sql.Date serviceEnd, String license) {
        this.id = id;
        this.enterpriseName = enterpriseName;
        this.name = name;
        this.maintenance_date = maintenance_date;
        this.manufacturing_year = manufacturing_year;
        ServicePeriod = servicePeriod;
        this.serviceStart = serviceStart;
        this.serviceEnd = serviceEnd;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMaintenance_date() {
        return maintenance_date;
    }

    public void setMaintenance_date(Date maintenance_date) {
        this.maintenance_date = maintenance_date;
    }

    public java.sql.Date getManufacturing_year() {
        return manufacturing_year;
    }

    public void setManufacturing_year(java.sql.Date manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }

    public int getServicePeriod() {
        return ServicePeriod;
    }

    public void setServicePeriod(int servicePeriod) {
        ServicePeriod = servicePeriod;
    }

    public java.sql.Date getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(java.sql.Date serviceStart) {
        this.serviceStart = serviceStart;
    }

    public java.sql.Date getServiceEnd() {
        return serviceEnd;
    }

    public void setServiceEnd(java.sql.Date serviceEnd) {
        this.serviceEnd = serviceEnd;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
