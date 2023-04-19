package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class AdminDirectory {


    private ArrayList<Admin> admins= new ArrayList<Admin>();
    public AdminDirectory(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }
}
