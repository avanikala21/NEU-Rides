package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class CustomerSupportAgentDirectory {
    ArrayList<CustomerSupportAgent> CSADirectory = new ArrayList<CustomerSupportAgent>();

    public CustomerSupportAgentDirectory(ArrayList<CustomerSupportAgent> CSADirectory) {
        this.CSADirectory = CSADirectory;
    }

    public ArrayList<CustomerSupportAgent> getCSADirectory() {
        return CSADirectory;
    }

    public void setCSADirectory(ArrayList<CustomerSupportAgent> CSADirectory) {
        this.CSADirectory = CSADirectory;
    }
}
