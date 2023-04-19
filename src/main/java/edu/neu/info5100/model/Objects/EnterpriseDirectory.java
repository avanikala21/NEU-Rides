package edu.neu.info5100.model.Objects;

import java.util.ArrayList;

public class EnterpriseDirectory {
    ArrayList<Enterprise> enterprise = new ArrayList<Enterprise>();

    public ArrayList<Enterprise> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(ArrayList<Enterprise> enterprise) {
        this.enterprise = enterprise;
    }

    public EnterpriseDirectory(ArrayList<Enterprise> enterprise) {
        this.enterprise = enterprise;
    }

    public boolean add(Enterprise enterprise) {
        return this.enterprise.add(enterprise);
    }
}
