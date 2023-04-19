package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class LocationDirectory {
    ArrayList<Location> locations = new ArrayList<Location>();

    public LocationDirectory(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public boolean add(Location location) {
        return locations.add(location);
    }
}
