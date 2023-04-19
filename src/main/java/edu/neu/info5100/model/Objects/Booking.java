package edu.neu.info5100.model.Objects;

public class Booking {
    private String customerUsername ;
    private int id;
    private  int customerid;
    private String fromLocation;
    private String toLocation;
    private String status;
    private int rideid;

    public Booking(String customerUsername, int id, int customerid, String fromLocation, String toLocation, String status, int rideid) {
        this.customerUsername = customerUsername;
        this.id = id;
        this.customerid = customerid;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.status = status;
        this.rideid = rideid;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRideid() {
        return rideid;
    }

    public void setRideid(int rideid) {
        this.rideid = rideid;
    }
}
