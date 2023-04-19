package edu.neu.info5100.model.Objects;

import java.sql.Time;
import java.util.Date;

public class Cabride {


    private int id;
    private String drivername;
    private String toLocation;
    private Date date;
    private Time time;
    private String status;
    private int maxPassengers;
    private int passengersCount;

    public Cabride(int id, String drivername, String toLocation, Date date, Time time, String status, int maxPassengers, int passengersCount) {
        this.id = id;
        this.drivername = drivername;
        this.toLocation = toLocation;
        this.date = date;
        this.time = time;
        this.status = status;
        this.maxPassengers = maxPassengers;
        this.passengersCount = passengersCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }
}
