package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class EnterpriseManagerDirectory {
    ArrayList<EnterpriseManager> Emanagers = new ArrayList<EnterpriseManager>();

    public ArrayList<EnterpriseManager> getEmanagers() {
        return Emanagers;
    }

    public void setEmanagers(ArrayList<EnterpriseManager> emanagers) {
        Emanagers = emanagers;
    }

    public EnterpriseManagerDirectory(ArrayList<EnterpriseManager> emanagers) {
        Emanagers = emanagers;
    }
}
