package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class DriverDirectory {
    ArrayList<Driver> drivers = new ArrayList<Driver>();

    public DriverDirectory(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }
}
