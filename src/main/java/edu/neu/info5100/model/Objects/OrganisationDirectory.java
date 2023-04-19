package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class OrganisationDirectory {
    ArrayList<Organisation> organisations = new ArrayList<Organisation>();

    public OrganisationDirectory(ArrayList<Organisation> organisations) {
        this.organisations = organisations;
    }

    public ArrayList<Organisation> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(ArrayList<Organisation> organisations) {
        this.organisations = organisations;
    }

    public boolean add(Organisation organisation) {
        return organisations.add(organisation);
    }
}
