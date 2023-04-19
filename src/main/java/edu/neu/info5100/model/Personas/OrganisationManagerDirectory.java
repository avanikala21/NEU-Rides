package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class OrganisationManagerDirectory {


    ArrayList<OrganisationManager> OManagers = new ArrayList<OrganisationManager>();

    public OrganisationManagerDirectory(ArrayList<OrganisationManager> OManagers) {
        this.OManagers = OManagers;
    }

    public ArrayList<OrganisationManager> getOManagers() {
        return OManagers;
    }

    public void setOManagers(ArrayList<OrganisationManager> OManagers) {
        this.OManagers = OManagers;
    }
}
