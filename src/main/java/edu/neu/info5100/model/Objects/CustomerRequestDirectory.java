package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class CustomerRequestDirectory {
    ArrayList<CustomerRequest> requests = new ArrayList<CustomerRequest>();

    public CustomerRequestDirectory(ArrayList<CustomerRequest> requests) {
        this.requests = requests;
    }

    public ArrayList<CustomerRequest> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<CustomerRequest> requests) {
        this.requests = requests;
    }

    public boolean add(CustomerRequest customerRequest) {
        return requests.add(customerRequest);
    }
}
