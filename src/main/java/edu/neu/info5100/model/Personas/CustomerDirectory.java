package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class CustomerDirectory {
    ArrayList<Customer> Customers = new ArrayList<Customer>();

    public CustomerDirectory(ArrayList<Customer> customers) {
        Customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return Customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        Customers = customers;
    }
}
