package edu.neu.info5100.model.Objects;

public class Organisation {
    private int id;
    private String driver;
    private String fromLocation;
    private String toLocation;
    private String organisation;
    private String enterprise;

    public Organisation(int id, String driver, String fromLocation, String toLocation, String organisation, String enterprise) {
        this.id = id;
        this.driver = driver;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.organisation = organisation;
        this.enterprise = enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
}
