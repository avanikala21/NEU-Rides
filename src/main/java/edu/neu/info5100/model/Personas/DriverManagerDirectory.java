package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class DriverManagerDirectory {

    ArrayList<DriverManager> DriverManagers = new ArrayList<DriverManager>();

    public DriverManagerDirectory(ArrayList<DriverManager> driverManagers) {
        DriverManagers = driverManagers;
    }

    public ArrayList<DriverManager> getDriverManagers() {
        return DriverManagers;
    }

    public void setDriverManagers(ArrayList<DriverManager> driverManagers) {
        DriverManagers = driverManagers;
    }
}
